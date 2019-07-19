package Agenda;

public class TesteAgenda {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		Contato anderson = new Contato();
		anderson.setNome("Anderson");
		anderson.setTelefoneResidencial("000000");
		anderson.setTelefoneCelular("000000");
		anderson.setEmail("anderson@gmail.com");
		agenda.adicionar(anderson);
		System.out.println(agenda);

		Contato roberto = new Contato("Roberto", "111111", "111111", "roberto@gmail.com");
		agenda.adicionar(roberto);
		System.out.println(agenda);

		Contato marcos = new Contato("Marcos", "222222", "222222", "marcos@gmail.com");
		agenda.adicionar(marcos);
		System.out.println(agenda);

		Contato aline = new Contato("Aline", "333333", "333333", "aline@gmail.com");
		agenda.adicionar(aline);
		System.out.println(agenda);

		Contato cezar = new Contato("Cezar", "444444", "444444", "cezar@gmail.com");
		agenda.adicionar(cezar);
		System.out.println(agenda);

		Contato emilio = new Contato("Emilio", "555555", "555555", "emilio@gmail.com");
		agenda.adicionar(emilio);
		System.out.println(agenda);

		Contato alana = new Contato("Alana", "777777", "777777", "alana@gmail.com");
		agenda.adicionar(alana);
		System.out.println(agenda);

		Contato zenon = new Contato("Zenon", "666666", "666666", "zenon@gmail.com");
		agenda.adicionar(zenon);
		System.out.println(agenda);

		System.out.println(agenda.remover(zenon.getNome()));
		System.out.println(agenda);

		System.out.println(agenda.remover("Alberto"));
		System.out.println(agenda);
		
		System.out.println(agenda.remover("Emilio"));
		System.out.println(agenda);
		
		agenda.imprimir("Cezar");
		
		System.out.println(agenda.remover("Cezar"));
		System.out.println(agenda);
		
		System.out.println(agenda.remover("Roberto"));
		System.out.println(agenda);
		
		System.out.println(agenda.remover("Marcos"));
		System.out.println(agenda);

		agenda.imprimir("Cezar");
	}

}
