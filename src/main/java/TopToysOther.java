import java.util.Collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Comparator;
import java.util.LinkedHashMap;

import java.util.stream.Collectors;

public class TopToysOther {

    public static void main(String[] args) {


        List<String> ret = topNBuzzwords(6, 2, new String[]{"elmo", "elsa", "legos", "drone", "tablet", "warcraft"}, 6,
                new String[]{
                        "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
                        "The new Elmo dolls are super high quality",
                        "Expect the Elsa dolls to be very popular this year, Elsa!",
                        "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
                        "For parents of older kids, look into buying them a drone",
                        "Warcraft is slowly rising in popularity ahead of the holiday season"
        });

        System.out.printf(ret.get(0) + ret.get(1));


    }

    static  List<String> topNBuzzwords(int numToys, int topToys, String[] toys, int numQuotes, String[] quotes) {
        Map<String, Integer> cache = new HashMap<>();
        for (String toy : toys) {
            for (String quote : quotes) {
                if (quote.toLowerCase().contains( toy )) {
                    cache.compute( toy, (key, value) -> value == null ? 1 : value + 1 );
                }
            }
        }
        Map<String, Integer> aMap = cache.entrySet().stream()
                .sorted( Map.Entry.comparingByValue( Comparator.reverseOrder() ) )
                .limit( topToys )
                .collect( Collectors.toMap( Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new ) );
        return aMap.keySet().stream().sorted().collect(Collectors.toList());
    }
}
