package br.com.gstok.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public abstract class HibernateUtil {

    private static SessionFactory fabricaSessao;
    private static Configuration cfgHibernate;

    static {

        try {

            iniciarHibernate();
            System.out.println("Hibernate iniciado com sucesso!");
        } catch (Throwable ex) {

            System.err.println("Falha ao iniciar o Hibernate!");
            ex.printStackTrace();
        }
    }

    private static void iniciarHibernate() {

        if (fabricaSessao == null) {

            fabricaSessao = configurarHibernate().buildSessionFactory();
        }
    }

    private static Configuration configurarHibernate() {

        if (cfgHibernate == null) {

            cfgHibernate=new AnnotationConfiguration();
            cfgHibernate.configure("/br/com/gstok/arquivos/hibernate.cfg.xml");
        }
        
        return cfgHibernate;
    }

    private static SessionFactory obterFabricaSessao() {
       
        return fabricaSessao;
    }

    protected static Session abrirSessao() {

        return obterFabricaSessao().openSession();
    }

    protected static void fecharSessao(Session sessao) {
        
        sessao.close();
    }
}