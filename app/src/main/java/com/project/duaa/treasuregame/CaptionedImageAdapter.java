package com.project.duaa.treasuregame;



import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class CaptionedImageAdapter extends RecyclerView.Adapter<CaptionedImageAdapter.ViewHolder> {
    private String[] captions;
    private int[] imageIds;
    private String [] level;
    private String []health;
    private Listener listener;

    interface Listener {
        void onClick(int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;

        public ViewHolder(CardView v) {
            super(v);
            cardView = v;
        }
    }

    public CaptionedImageAdapter(String[] captions, int[] imageIds,String[] level,String[] health) {
        this.captions = captions;
        this.imageIds = imageIds;
        this.level=level;
        this.health=health;
    }

    @Override
    public int getItemCount() {
        return captions.length;
    }

    public void setListener(Listener listener){
        this.listener = listener;
    }

    @Override
    public CaptionedImageAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType){
             CardView cv = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(cv);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position){
        final  CardView cardView = holder.cardView;
        ImageView imageView = (ImageView)cardView.findViewById(R.id.info_image);
        Drawable drawable = ContextCompat.getDrawable(cardView.getContext(), imageIds[position]);

        imageView.setImageDrawable(drawable);
        imageView.setContentDescription(captions[position]);

        TextView textView = (TextView)cardView.findViewById(R.id.info_text);
        TextView textView2 = (TextView)cardView.findViewById(R.id.info_level);
        TextView txthealth=(TextView)cardView.findViewById(R.id.info_health);
        textView.setText("Name:"+captions[position]);
        textView2.setText("Level:"+level[position]);
        txthealth.setText("Health:"+health[position]);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(position);
                }
            }
        });
    }
}
