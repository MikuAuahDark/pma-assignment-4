package id.co.npad93.pm.t4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharaDataAdapter extends RecyclerView.Adapter<CharaDataAdapter.ViewHolder> {
    public CharaDataAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_character, parent, false);
        ViewHolder holder = new ViewHolder(view, context);
        view.setOnClickListener(holder);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CharaData c = CharaData.get(position);
        holder.character = c;
        holder.name.setText(c.getName());
        holder.affiliation.setText(c.getAffiliation());
        holder.image.setImageResource(c.getImage());
    }

    @Override
    public int getItemCount() {
        return CharaData.count();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        CharaData character;

        Context context;
        TextView name, affiliation;
        ImageView image;

        public ViewHolder(@NonNull View itemView, Context a) {
            super(itemView);
            context = a;
            name = itemView.findViewById(R.id.textView);
            affiliation = itemView.findViewById(R.id.textView2);
            image = itemView.findViewById(R.id.imageView);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(context, DescActivity.class)
                .putExtra("name", character.getName());
            context.startActivity(intent);
        }
    }

    private Context context;
}
