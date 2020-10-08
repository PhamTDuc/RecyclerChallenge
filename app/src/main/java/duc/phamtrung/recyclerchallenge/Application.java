package duc.phamtrung.recyclerchallenge;

import java.util.ArrayList;

public class Application extends android.app.Application{
    public static ArrayList<Item> items;

    @Override
    public void onCreate() {
        super.onCreate();
        items = new ArrayList<>();
        items.add(new Item("PhamDuc","AVH","Volwagen"));
        items.add(new Item("PhamDuc","AVH","Nissan"));
        items.add(new Item("PhamDuc","AVH","Mercedes"));
    }
}
