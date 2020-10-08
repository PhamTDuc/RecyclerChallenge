package duc.phamtrung.recyclerchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ItemAdapter.ItemSelected, View.OnClickListener {

    Button btnName, btnBrand;
    TextView tvName;
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnName = findViewById(R.id.btnName);
        btnBrand = findViewById(R.id.btnBrand);
        tvName = findViewById(R.id.tvName2);
        imgView = findViewById(R.id.imgView2);
        btnName.setOnClickListener(MainActivity.this);
        btnBrand.setOnClickListener(MainActivity.this);
    }

    @Override
    public void OnItemSelected(int index)
    {
        Item item = Application.items.get(index);
        tvName.setText(item.getName().trim());
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
                imgView.setVisibility(View.VISIBLE);
                tvName.setVisibility(View.GONE);
                break;
            case R.id.btnName:
                imgView.setVisibility(View.GONE);
                tvName.setVisibility(View.VISIBLE);
                break;
        }
    }
}