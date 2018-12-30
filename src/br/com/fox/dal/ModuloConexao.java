package br.com.fox.dal;
// importando um conjunto de bibliotecas 

import java.sql.*;
/* camada de acesso ao banco de dados
 * @author thalita
 */
public class ModuloConexao {
//método responsável por estabelecer a conexão com o banco
    public static Connection conector(){
//conection é um framework (conjunto de funcionalidade que vem com a importação do pacote import java.sql 
//conector é o nome do método, sempre que temos um método sem a palavra void é um método que tem que ter um retorno 

// criando uma variável especial para estabelecer a conexão, CONEXAO É A VARIÁVEL QUE VAI RECEBER A STRING DE CONEXÃO, O MÉTODO SE CHAMA CONECTOR
    java.sql.Connection conexao = null;
    //chamando o driver
    String driver = "com.mysql.jdbc.Driver";//var quem é o driver
    //Armazenando informações referente ao banco de dados
    String url="jdbc:mysql://localhost:3306/dbfox"+"?useTimezone=true&serverTimezone=UTC" ;//caminho e nome do banco de dados
    String user="root";//qual usuário
    String password="";//senha
    //estabelecendo a conexão com o banco
        try {
            Class.forName(driver);//executa o arquivo do driver
            conexao = DriverManager.getConnection(url,user, password); //conexao é a variável criada, estes são os parâmetros para ligarmos o bd com o Java
            return conexao;
            //na ausência de problemas, estabelecendo conexão
        } catch (Exception e) {
            //na tentativa de conexão, caso haja excessão, teremos aqui uma reposta
            
            //System.out.println(e); -apoio para identificar erros
            return null;
        }
    }
}

