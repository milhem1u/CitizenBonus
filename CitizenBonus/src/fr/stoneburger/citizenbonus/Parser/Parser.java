package fr.stoneburger.citizenbonus.Parser;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class Parser {
		
	public static void main (String[] args) throws IOException {
		Yaml yaml = new Yaml();
        try (InputStream in = Parser.class.getResourceAsStream("test.yml")) {
            ListNpc npcs = yaml.loadAs(in, ListNpc.class);
            for (Npc npc : npcs.getNpcs()) {
                System.out.println(npc);
            }
        }
	}
}