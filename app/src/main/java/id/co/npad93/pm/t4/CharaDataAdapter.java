package id.co.npad93.pm.t4;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CharaDataAdapter extends RecyclerView.Adapter<CharaDataAdapter.ViewHolder> {
    public CharaDataAdapter(Activity activity) {
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_selection_list, parent, false);
        ViewHolder holder = new ViewHolder(view, activity);
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

        Activity activity;
        TextView name, affiliation;
        ImageView image;

        public ViewHolder(@NonNull View itemView, Activity a) {
            super(itemView);
            activity = a;
            name = itemView.findViewById(R.id.textView);
            affiliation = itemView.findViewById(R.id.textView2);
            image = itemView.findViewById(R.id.imageView);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent(activity, DescActivity.class)
                .putExtra("name", character.getName());
            activity.startActivity(intent);
        }
    }

    private Activity activity;
}
