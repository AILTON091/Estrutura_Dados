package br.com.estruturadados.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// Map - possui chave e valor
		
		Map<String, String> chave = new HashMap<>();
		
		chave.put("Nome", "Ailton");
		chave.put("Idade", "28");
		
		List<Map<String, String>> list = new ArrayList<>();
			
		list.add(chave);
		
		System.out.println(chave.values());

	}

}
