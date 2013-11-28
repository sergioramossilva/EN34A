package br.com.gstok.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class TransactionUtil {

    private static Transaction transacao;
    private static Session sessao;

    protected static Session obterSessao() {

        sessao = HibernateUtil.abrirSessao();
        return sessao;
    }

    protected static Transaction iniciarTransacao(Session sessao) {

        transacao=sessao.beginTransaction();
        return transacao;
    }

    protected static void fecharSessao(Session sessao) {

        HibernateUtil.fecharSessao(sessao);
    }
}