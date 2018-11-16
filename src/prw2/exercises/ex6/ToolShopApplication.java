package exercises.ex6;

import exercises.ex3.Tool;

import java.util.ArrayList;
import java.util.List;

public class ToolShopApplication {

    public static void main(String[] args) {
        List<String> toolNames = new ArrayList<>();
        toolNames.add("Screwdriver");
        toolNames.add("Hammer");
        toolNames.add("Measuring Tape");

        ShopAssistant shopAssistant = new ShopAssistant();
        Toolbox foundToolbox = shopAssistant.findToolbox("red", toolNames);
        for (Tool tool :
                foundToolbox.getTools()) {
            System.out.println(tool.getName());
        }
    }

}
