package duc.phamtrung.recyclerchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ItemAdapter.ItemSelected, View.OnClickListener {

    Button btnName, btnBrand;
    TextView tvName, tvModel2, tvNumber;
    ImageView imgView;
    LinearLayout owner_detail, description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        owner_detail = findViewById(R.id.owner_detail);
        description = findViewById(R.id.description);

        btnName = findViewById(R.id.btnName);
        btnBrand = findViewById(R.id.btnBrand);
        tvName = findViewById(R.id.tvName2);
        imgView = findViewById(R.id.imgView2);
        tvModel2 = findViewById(R.id.tvModel2);
        tvNumber = findViewById(R.id.tvNumber);

        btnName.setOnClickListener(MainActivity.this);
        btnBrand.setOnClickListener(MainActivity.this);

        OnItemSelected(0);
    }

    @Override
    public void OnItemSelected(int index)
    {
        Item item = Application.items.get(index);
        tvName.setText(item.getName().trim());
        tvModel2.setText(item.getModel().trim());
        tvNumber.setText(item.getNumber().trim());

        switch (item.getBrand())
        {
            case "Mercedes":
                imgView.setImageResource(R.drawable.mercedes);
                break;
            case "Nissan":
                imgView.setImageResource(R.drawable.nissan);
                break;
            case "Volkswagen":
                imgView.setImageResource(R.drawable.volkswagen);
                break;
        }
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnBrand:
                description.setVisibility(View.VISIBLE);
                owner_detail.setVisibility(View.GONE);
                break;
            case R.id.btnName:
                description.setVisibility(View.GONE);
                owner_detail.setVisibility(View.VISIBLE);
                break;
        }
    }
}