package prw2.exercises.ex6;

import prw2.exercises.ex3.Tool;

import java.util.List;

public class ShopAssistant {

    public Toolbox findToolbox(String color, List<String> toolNames) {
        Toolbox toolbox = new Toolbox(color);
        for (String tool:
             toolNames) {
            toolbox.add(new Tool(tool));
        }
        return toolbox;
    }

}
