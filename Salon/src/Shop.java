import java.util.HashMap;
import java.util.Map;



public interface Shop  {

    public HashMap<String, Integer> products = new HashMap<>(){{
        put("Телевизор sony", 14990);
        put("Телевизор samsung", 20990);
        put("Стиралка Bosch", 15990);
        put("Телефон Nokia", 1990);
        put("Телефон Vertu", 200990);
    }};
}
