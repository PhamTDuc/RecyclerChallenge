package duc.phamtrung.recyclerchallenge;

import java.util.ArrayList;

public class Application extends android.app.Application{
    public static ArrayList<Item> items;

    @Override
    public void onCreate() {
        super.onCreate();
        items = new ArrayList<>();
        items.add(new Item("PhamDuc","AVH","Volkswagen", "092342553"));
        items.add(new Item("PhamCong","AVwerewrH","Nissan","126461666"));
        items.add(new Item("PhamMinh","AVdsdsdH","Mercedes","093245677"));
    }
}
