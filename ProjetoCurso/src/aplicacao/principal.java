package aplicacao;
    import entidade.CorridaGerente;
    import entidade.CorridaUsuario;
    import java.util.Scanner;
    //import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

import entidade.CorridaInterligacao;
    import entidade.Cadastro;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.util.Random;
    import java.util.List;
    import java.util.ArrayList;

public class principal {



   public static void main(String[] args) {
        
    
    Scanner recebe = new Scanner(System.in);
        CorridaGerente cg = new CorridaGerente();
        CorridaUsuario user = new CorridaUsuario();
        Cadastro cad = new Cadastro();
        



   Connection conecta = null;
        
        try {
            //Indicação da conexão com o MySQL através do protocolo JDBC
            //além do IP do servidor (localhost)
            //base de dados ou schema (javamysql)
            //usuário para autenticação (root)
            //senha do usuário root
            
            conecta = DriverManager.getConnection("jdbc:mysql://localhost/projetocurso?" +"user=root&password=root");
            
            
              
           System.out.println("Conexão realizada com sucesso.");
            
            
            
            int escolha=0;
            int cont=0;
            int numero_corrida;
        System.out.println("Bem vindo ao MaratoFlix");
        
        System.out.println("Insira o seu codigo de acesso:");
        cad.setCodigo(new Scanner(System.in).nextInt());
        
        System.out.println("Digite a sua senha:");
        cad.setSenha(new Scanner(System.in).nextLine());
        
        System.out.println("Digite 1-Usuario Comum 2-Usuario Gerente 3-Opcoes de corrida");
        int opcao= new Scanner(System.in).nextInt();
        
        
        switch (opcao) {
        
        case 1:
        	
                System.out.println("Digite seu nome");
                user.setNome(new Scanner(System.in).nextLine());
            //    String nome = new Scanner(System.in).nextLine();
                
                System.out.println("Digite sua idade");
                user.setIdade(recebe.nextInt());
                //int idade = new Scanner(System.in).nextInt();
                
                System.out.println("Digite um telefone para contato");
                user.setTelefone(recebe.nextInt());
                //String telefone = new Scanner(System.in).nextLine();
                
                System.out.println("Informe o seu sexo:");
                user.setSexo(new Scanner(System.in).nextLine());
                //String sexo =new Scanner(System.in).nextLine();
                
                System.out.println("Digite seu CPF");
                user.setCpf(recebe.nextInt());
                //int cpf = new Scanner(System.in).nextInt();
                
                System.out.println("Qual forma de pagamento");
                user.setFrm_pagamento(new Scanner(System.in).nextLine());
                //String frm_pagamento = new Scanner(System.in).nextLine();
                
        
                
                
                
                System.out.println("Cadastro realizado com sucesso");
                
                
				break;
                
              
               
               
        case 2:
            
            System.out.println("Informe o nome da corrida:");
            cg.setNome_org(new Scanner(System.in).nextLine());
            //String nome_org = new Scanner(System.in).nextLine();
            
            
            System.out.println("Informe o CNPJ da sua empresa:");
            cg.setCnpj(recebe.nextInt());
       //     int cnpj = new Scanner(System.in).nextInt();
            
            System.out.println("Informe o local da corrida:");
            cg.setLocall( new Scanner(System.in).nextLine());
            //String local = new Scanner(System.in).nextLine();
            
            System.out.println("Informe a data da corrida:");
            cg.setDataa(new Scanner(System.in).nextLine());
            //String data = new Scanner(System.in).nextLine();
            
            System.out.println("Informe o horario da corrida:");
            cg.setHorario( new Scanner(System.in).nextLine());
            //String horario = new Scanner(System.in).nextLine();
            
            System.out.println("Informe a kilometragem da corrida:");
            cg.setKilometragem(recebe.nextFloat());
            //float kilometragem = new Scanner(System.in).nextFloat();
            
            System.out.println("Informe o numero limite de inscricoes:");
            cg.setNm_insc(recebe.nextInt());
            //int nm_insc = new Scanner(System.in).nextInt();
            
            System.out.println("Informe os patrocinadores da sua corrida");
            cg.setPatrocinadores(new Scanner(System.in).nextLine());
            
            
            
            System.out.println("Informe o site para comprar os ingressos:");
            cg.setSite_ing(new Scanner(System.in).nextLine());
            //String site_ing = new Scanner(System.in).nextLine();
            
            System.out.println("Informe o preco do ingresso:");
            cg.setPreco(recebe.nextFloat());
            //float preco = new Scanner(System.in).nextFloat();
            
            System.out.println("Informe a regiao da corrida:");
            cg.setRegiao(new Scanner(System.in).nextLine());
            //String regiao = new Scanner(System.in).nextLine();
            
            System.out.println("Informe o SAC:");
            cg.setSac(recebe.nextInt());
            //int sac = new Scanner(System.in).nextInt();
            
            
            //CorridaGerente cg = new CorridaGerente(cnpj, nome_org, local, data, horario, kilometragem,  nm_insc,  site_ing,  preco,  regiao,  sac);
            
            System.out.println("Sua corrida "+cg.getNome_org()
                    + "\nque acontecera no dia " +cg.getDataa()
                    + "\nas "+cg.getHorario()
                    + " horas\nem "+cg.getLocall()
                    + "\no trajeto acontecera na " +cg.getRegiao()
                    + "\nao todo sera percorrido " +cg.getKilometragem()
                    + " km \ntera "+cg.getNm_insc()+ " inscricoes ao todo,"
                    + " \no evento contara com a ajuda dos colaboradores: "+cg.getPatrocinadores());
                    System.out.println("Os ingressos poderao ser adquiridos no site da(o) "+cg.getSite_ing()
                    + " \npelo valor de R$"+cg.getPreco()+" reais.\n"
                    + "\n"
                    + "O SAC para informar para os seus clientes e :"+cg.getSac()); ;
                
            
            break;
              
        case 3:
        	
        	 do {
        		 String consulta = "SELECT nome_org, codCorrida from corridaGerente;"; 
        		 Statement comando = conecta.prepareStatement(consulta); 
        		 ResultSet retorno = comando.executeQuery(consulta); 
                     
        		 System.out.println("Nome do cadastro:"); 
             
        		 while(retorno.next()){ //Enquanto o retorno possuir linhas 

        			 System.out.println(retorno.getString("nome_org")+" - "+ (retorno.getInt("codCorrida")));
        	  	   } 
        		 System.out.println("Digite o numero da corrida para ver a descricao");
        		 numero_corrida = new Scanner(System.in).nextInt();
        	
        	/*List<String< dados=new ArrayList<>()>>;
        	String consulta1= "SELECT codCorrida, locall, dataa, horario, kilometragem, nm_insc, patrocinadores, Site_ing, preco, regiao, sac FROM corridaGerente";

        	Statement comando1 = conecta.prepareStatement(consulta1); 
            ResultSet retorno1 = comando1.executeQuery(consulta1); 
          
            System.out.println(comando1);
        	System.out.println(numero_corrida);
        	System.out.println(retorno1.getInt("corridaGerente.codCorrida"));
            
        	while(retorno1.next()){
        	if(numero_corrida==retorno1.getInt("codCorrida")) {
        		System.out.println(retorno1.getString("locall")+" - "
        	+ retorno1.getString("dataa")+" - " 
        	+retorno1.getString("horario")+" - "
        	+ retorno1.getFloat("kilometragem")
        	+ " - "+retorno1.getInt("nm_insc")+" - "
        	+ retorno1.getString("patrocinadores")+ " - "
        	+retorno1.getString("Site_ing")+" - "
        	+ retorno1.getFloat("preco")+ " - "
        	+ retorno1.getString("regiao")+" - "
        	+ retorno1.getInt("sac"));
        	}
        	*/
            
        	
        	
        	
        	
        	
        	
        //	public void buscar(){     

        		List<String> usuarios = new ArrayList<String>(); 
        		String resultado = null;     
        		String sql = "SELECT * FROM corridaGerente";     
        		try {    
        			PreparedStatement pst = conecta.prepareStatement(sql);     
        			ResultSet rs = pst.executeQuery();   
        			
        			
        			while(rs.next()){
        				if(numero_corrida==rs.getInt("codCorrida")) {
        	        	System.out.println("Local da corrida: "+rs.getString("locall")+"\n"
        	        	+ "Data: "+rs.getString("dataa")+"\n" 
        	        	+"Horario: "+rs.getString("horario")+"\n"
        	        	+"Kilometragem: "+ rs.getFloat("kilometragem")
        	        	+"Patrocinadores: "+rs.getString("patrocinadores")+ "\n"
        	        	+"Site para a compra do ingresso: "+rs.getString("Site_ing")+"\n"
        	        	+"Preco do ingresso: "+ rs.getFloat("preco")+ "\n"
        	        	+"Regiao da corrida: "+ rs.getString("regiao")+"\n"
        	        	+"Sac da empresa: "+ rs.getInt("sac"));
        				}
        			
        						
        			
        			
        			
        			  			
        			
        			
        			
        			
        		/*	while(rs.next()) {          
        				resultado = (
        			    "Nome da Corrida: "+ rs.getNome ()+" \n" +
        				"Local: "+rs.getString()+" \n" +
        			    "Data: "+rs.getString()+" \n" + 
        				"Horario: "+rs.getString()+" \n" +
        			    "Kilometragem: "+rs.getString(2)+" \n" +
        				"Patrocinadores: "+rs.getString(2)+" \n" +   
        				"Site para a compra de ingressos: "+rs.getString(2)+" \n" + 
        				"Preco do ingresso: R$"+rs.getString(2)+" \n" + 
        				"Regiao da corrida: "+rs.getString(2)+" \n" + 
        			    "Sac da empresa da corrida:  "+rs.getString(2));    */     
        		        usuarios.add(resultado); //adiciona o usuario encontrado na lista        
        		 }  
        
        		}
        		catch (SQLException e) {    
        		 JOptionPane.showMessageDialog(null, e);     
        		}     //imprime todos os resultados     
        	
			//	for(String r : valor) {
        		System.out.println(resultado);   
        		//} 
        	
                  System.out.println("Digite 1-Comprar o ingresso 2-Voltar para o menu");
          escolha = new Scanner(System.in).nextInt();
          
          if(escolha==1) {
        	  Random aleatorio = new Random();
        	  int valor = aleatorio.nextInt(5000)+1;
        	  System.out.println("Numero da sua incricao e: "+valor);
        	  System.out.println("Boa corrida");
          }
          
        	}while(escolha!=1);
        
        	 break;
   	 default:
   		 System.out.println("Invalido");
   	 }
    
        
        
        
        //Banco de dados para o usuario
   
        String sqlUsuario = "INSERT INTO corridaUsuario(nome, sexo, telefone, cpf, dataNasc, frm_pagamento) VALUES(?,?,?,?,?,?)";  


        try {  
              PreparedStatement stmt = conecta.prepareStatement(sqlUsuario);  
              stmt.setString(1, user.getNome());  
              stmt.setString(2, user.getSexo()); 
              stmt.setInt(3, user.getTelefone());  
              stmt.setInt(4, user.getCpf());
              stmt.setString(5, user.getDataNasc());  
              stmt.setString(6, user.getFrm_pagamento());
              stmt.execute();  
              stmt.close();  


        } catch (SQLException u) {  
              throw new RuntimeException(u);  
      }          
      
        int i=0;
        
        //banco de dados para o gerente.
        String sqlGerente = "INSERT INTO corridaGerente(cnpj, nome_org, locall, dataa, horario, kilometragem, nm_insc, patrocinadores, Site_ing, preco, regiao, sac) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {  
              PreparedStatement stmt = conecta.prepareStatement(sqlGerente);  
              stmt.setInt(1, cg.getCnpj());  
              stmt.setString(2, cg.getNome_org()); 
              stmt.setString(3, cg.getLocall());  
              stmt.setString(4, cg.getDataa());
              stmt.setString(5, cg.getHorario());  
              stmt.setFloat(6, cg.getKilometragem());
              stmt.setInt(7, cg.getNm_insc());  
              stmt.setString(8, cg.getPatrocinadores());  
              stmt.setString(9, cg.getSite_ing());  
              stmt.setFloat(10, cg.getPreco());  
              stmt.setString(11, cg.getRegiao());  
              stmt.setInt(12, cg.getSac());  
              stmt.execute();  
              stmt.close();  

        } catch (SQLException u) {  
              throw new RuntimeException(u);  
      }          
      
        }
          
       
          
        
  
 catch (SQLException ex) {
  //Caso ocorram erros na tentativa de conex�o com o MySQL
  System.out.println("SQLException: " + ex.getMessage());
  System.out.println("SQLState: " + ex.getSQLState());
  System.out.println("VendorError: " + ex.getErrorCode());
}



   
}
   }