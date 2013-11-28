SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `mydb` ;
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
SHOW WARNINGS;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `Cidades`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Cidades` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Cidades` (
  `codigo` INT NOT NULL ,
  `nome` VARCHAR(350) NOT NULL ,
  `uf` CHAR(2) NOT NULL ,
  `ddd` CHAR(2) NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `idxNome` ON `Cidades` (`nome` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Produtos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Produtos` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Produtos` (
  `codigo` INT(11)  NOT NULL ,
  `descricao` VARCHAR(200) NOT NULL ,
  `marca` VARCHAR(100) NOT NULL ,
  `modelo` VARCHAR(100) NOT NULL ,
  `quantidade` INT NOT NULL ,
  `qntMinima` INT NOT NULL ,
  `qntMaxima` INT NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `idxDescricao` ON `Produtos` (`descricao` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxMarca` ON `Produtos` (`marca` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxModelo` ON `Produtos` (`modelo` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Enderecos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Enderecos` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Enderecos` (
  `codigo` INT NOT NULL ,
  `logradouro` VARCHAR(350) NOT NULL ,
  `numero` VARCHAR(10) NOT NULL ,
  `bairro` VARCHAR(100) NOT NULL ,
  `complemento` VARCHAR(75) NOT NULL ,
  `cep` VARCHAR(10) NOT NULL ,
  `cidade` INT NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `idxCep` ON `Enderecos` (`cep` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxLogradouro` ON `Enderecos` (`logradouro` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Fornecedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Fornecedor` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Fornecedor` (
  `codigo` INT NOT NULL ,
  `cnpj` VARCHAR(14) NOT NULL ,
  `ie` VARCHAR(14) NOT NULL ,
  `dtAbertura` DATE NOT NULL ,
  `nomeFantasia` VARCHAR(350) NOT NULL ,
  `razaoSocial` VARCHAR(350) NOT NULL ,
  `endereco` INT NOT NULL ,
  `email` VARCHAR(100) NOT NULL ,
  `ativo` TINYINT(1)  NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `cnpj_UNIQUE` ON `Fornecedor` (`cnpj` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxCnpj` ON `Fornecedor` (`cnpj` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxIe` ON `Fornecedor` (`ie` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxNomeFantasia` ON `Fornecedor` (`nomeFantasia` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxRazaoSocial` ON `Fornecedor` (`razaoSocial` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Telefones_Fornecedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Telefones_Fornecedor` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Telefones_Fornecedor` (
  `codigo` INT(11)  NOT NULL ,
  `fornecedor` INT NOT NULL ,
  `tipo` VARCHAR(30) NOT NULL ,
  `numero` VARCHAR(20) NOT NULL ,
  `dono` VARCHAR(50) NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `idxNumero` ON `Telefones_Fornecedor` (`numero` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `ClientesPF`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ClientesPF` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `ClientesPF` (
  `codigo` INT NOT NULL ,
  `cpf` VARCHAR(11) NOT NULL ,
  `rg` VARCHAR(11) NOT NULL ,
  `dtNascimento` DATE NOT NULL ,
  `nome` VARCHAR(350) NOT NULL ,
  `estCivil` VARCHAR(20) NOT NULL ,
  `sexo` CHAR(1) NOT NULL ,
  `endereco` INT NOT NULL ,
  `email` VARCHAR(150) NOT NULL ,
  `profissao` VARCHAR(150) NOT NULL ,
  `empresa` VARCHAR(350) NOT NULL ,
  `renda` DOUBLE NOT NULL ,
  `ativo` TINYINT(1)  NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `cpf_UNIQUE` ON `ClientesPF` (`cpf` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `ClientesPJ`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `ClientesPJ` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `ClientesPJ` (
  `codigo` INT NOT NULL ,
  `cnpj` VARCHAR(14) NOT NULL ,
  `ie` VARCHAR(14) NOT NULL ,
  `dtAbertura` DATE NOT NULL ,
  `nomeFantasia` VARCHAR(350) NOT NULL ,
  `razaoSocial` VARCHAR(350) NOT NULL ,
  `endereco` INT NOT NULL ,
  `email` VARCHAR(150) NOT NULL ,
  `atividade` VARCHAR(200) NOT NULL ,
  `capital` DOUBLE NOT NULL ,
  `ativo` TINYINT(1)  NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `cnpj_UNIQUE` ON `ClientesPJ` (`cnpj` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Produtos_Fornecedor`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Produtos_Fornecedor` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Produtos_Fornecedor` (
  `Produtos_codigo` INT(11)  NOT NULL ,
  `Fornecedor_codigo` INT NOT NULL ,
  PRIMARY KEY (`Produtos_codigo`, `Fornecedor_codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `produto_fk` ON `Produtos_Fornecedor` (`Produtos_codigo` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Usuarios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Usuarios` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Usuarios` (
  `codigo` INT NOT NULL ,
  `matricula` VARCHAR(15) NOT NULL ,
  `senha` VARCHAR(128) NOT NULL ,
  `dtExpSenha` DATE NOT NULL ,
  `ativo` TINYINT(1)  NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Grupos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Grupos` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Grupos` (
  `codigo` INT NOT NULL ,
  `nome` VARCHAR(70) NOT NULL ,
  `nvAcesso` VARCHAR(3) NOT NULL ,
  `inativo` TINYINT(1)  NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Usuarios_Grupos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Usuarios_Grupos` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Usuarios_Grupos` (
  `usuarios` INT NOT NULL ,
  `grupos` INT NOT NULL ,
  PRIMARY KEY (`usuarios`, `grupos`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Telefones_ClientesPF`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Telefones_ClientesPF` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Telefones_ClientesPF` (
  `codigo` INT(11)  NOT NULL ,
  `clientePF` INT NOT NULL ,
  `tipo` VARCHAR(30) NOT NULL ,
  `numero` VARCHAR(20) NOT NULL ,
  `dono` VARCHAR(50) NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Telefones_ClientesPJ`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Telefones_ClientesPJ` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Telefones_ClientesPJ` (
  `codigo` INT(11)  NOT NULL ,
  `clientePJ` INT NOT NULL ,
  `tipo` VARCHAR(30) NOT NULL ,
  `numero` VARCHAR(20) NOT NULL ,
  `dono` VARCHAR(50) NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Funcionarios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Funcionarios` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Funcionarios` (
  `codigo` INT NOT NULL ,
  `cpf` VARCHAR(11) NOT NULL ,
  `rg` VARCHAR(11) NOT NULL ,
  `dtNascimento` DATE NOT NULL ,
  `nome` VARCHAR(350) NOT NULL ,
  `estCivil` VARCHAR(20) NOT NULL ,
  `sexo` CHAR(1) NOT NULL ,
  `endereco` INT NOT NULL ,
  `email` VARCHAR(150) NOT NULL ,
  `dtAdmissao` DATE NOT NULL ,
  `dtSaida` DATE NOT NULL ,
  `cargo` VARCHAR(100) NOT NULL ,
  `salario` DOUBLE NOT NULL ,
  `ativo` TINYINT(1)  NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE UNIQUE INDEX `cpf_UNIQUE` ON `Funcionarios` (`cpf` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxNome` ON `Funcionarios` (`nome` ASC) ;

SHOW WARNINGS;
CREATE INDEX `idxCpf` ON `Funcionarios` (`cpf` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Telefones_Funcionario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Telefones_Funcionario` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Telefones_Funcionario` (
  `codigo` INT(11)  NOT NULL ,
  `funcionario` INT NOT NULL ,
  `tipo` VARCHAR(30) NOT NULL ,
  `numero` VARCHAR(20) NOT NULL ,
  `dono` VARCHAR(50) NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;
CREATE INDEX `idxNumero` ON `Telefones_Funcionario` (`numero` ASC) ;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Socios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Socios` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Socios` (
  `clientePF` INT NOT NULL ,
  `clientePJ` INT NOT NULL ,
  `qntAcoes` DOUBLE NOT NULL ,
  PRIMARY KEY (`clientePF`, `clientePJ`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Representantes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Representantes` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Representantes` (
  `codigo` INT NOT NULL ,
  `fornecedor` INT NOT NULL ,
  `nome` VARCHAR(350) NOT NULL ,
  `email` VARCHAR(150) NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `Telefones_Representantes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Telefones_Representantes` ;

SHOW WARNINGS;
CREATE  TABLE IF NOT EXISTS `Telefones_Representantes` (
  `codigo` INT(11)  NOT NULL ,
  `representante` INT NOT NULL ,
  `tipo` VARCHAR(30) NOT NULL ,
  `numero` VARCHAR(20) NOT NULL ,
  `dono` VARCHAR(50) NOT NULL ,
  PRIMARY KEY (`codigo`) )
ENGINE = InnoDB;

SHOW WARNINGS;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
