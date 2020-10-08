package duc.phamtrung.recyclerchallenge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder>
{
    private ArrayList<Item> items;
    private ItemSelected host;

    public ItemAdapter(ArrayList<Item> items, Context host) {
        this.items = items;
        this.host = (ItemSelected) host;
    }

    public interface ItemSelected
    {
        void OnItemSelected(int index);
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvModel, tvName;
        ImageView imgView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvModel = itemView.findViewById(R.id.tvModel);
            tvName = itemView.findViewById(R.id.tvName);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    host.OnItemSelected(items.indexOf(v.getTag()));
                }
            });
        }
    }

    @NonNull
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position)
    {
        Item item = items.get(position);
        holder.itemView.setTag(item);
        holder.tvName.setText(item.getName());
        holder.tvModel.setText(item.getModel());
        switch (item.getBrand())
        {
            case "Mercedes":
                holder.imgView.setImageResource(R.drawable.mercedes);
                break;
            case "Nissan":
                holder.imgView.setImageResource(R.drawable.nissan);
                break;
            case "Volwagen":
                holder.imgView.setImageResource(R.drawable.volkswagen);
                break;
        }

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
