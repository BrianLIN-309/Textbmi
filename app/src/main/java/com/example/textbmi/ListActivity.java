package com.example.textbmi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {



    class personAdapter extends RecyclerView.Adapter<personAdapter.PersonViewHolder>{

        public personAdapter(@NonNull ArrayList<person> personList) {
            this.personList = personList;
        }

        @NonNull

        ArrayList<person> personList ;

        @Override
        public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bmilist,parent,false);
            return new PersonViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
            person p =personList.get(position);
            holder.height.setText(String.valueOf(p.getHeight()));
            holder.weight.setText(String.valueOf(p.getWeight()));


        }

        @Override
        public int getItemCount() {
            return personList.size();
        }

        class PersonViewHolder extends RecyclerView.ViewHolder{

            private final TextView height;
            private final TextView weight;

            public PersonViewHolder(@NonNull View itemView) {
                super(itemView);
                height = itemView.findViewById(R.id.tv_height);
                weight = itemView.findViewById(R.id.tv_weight);
            }
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }
}