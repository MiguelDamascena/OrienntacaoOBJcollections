package br.com.fiap.Collections;
import java.util.*;
public class Executavel {
	public static void main(String[] args) {
		List<Usuario> list = new ArrayList<Usuario>();
		
		Usuario user2 = new Usuario(2,"Miguel ","miguel123");
		list.add(user2);
		Usuario user1 = new Usuario(1,"Bianca","bianca123");
		list.add(user1);
		Usuario user3 = new Usuario(3,"Rosana","rosana123");
		list.add(user3);
		Usuario user5 = new Usuario(5,"Luisão ","luisao123");
		list.add(user5);
		Usuario user4 = new Usuario(4,"Davinho ","deivinho123");
		list.add(user4);
		
		Map mapa = new HashMap();
		mapa.put("Miguel", user2 );
		mapa.put("Bianca", user1 );
		mapa.put("Rosana", user3 );
		mapa.put("Luisao", user5 );
		mapa.put("Davinho", user4 );
		
		Object objeto = mapa.get(user1);
		Usuario usuario = (Usuario) objeto;

	
	
		Collections.sort(list);
		for (Usuario user:list) {
			System.out.println(user.getNome());
		}
	
	}
}

