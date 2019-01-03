package fr.stoneburger.citizenbonus.Parser;


import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;

public class LoadAsJavaObject {
	
    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
        try (InputStream in = LoadAsJavaObject.class
                .getResourceAsStream("test.yml")) {
            Npc npc = yaml.loadAs(in, Npc.class);
            System.out.println(npc);
        }
    }
}
