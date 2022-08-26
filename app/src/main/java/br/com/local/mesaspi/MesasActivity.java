package br.com.local.mesaspi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MesasActivity extends AppCompatActivity {
    GridView gridView;
    String txtNumMesa[]={
            "Mesa 1","Mesa 2","Mesa 3","Mesa 4","Mesa 5","Mesa 6","Mesa 7","Mesa 8",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mesas_layout);
        gridView = findViewById(R.id.gridMesas);


    }

    public class AdaptadorMesas extends BaseAdapter{

        @Override
        public int getCount() {
            return txtNumMesa.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View v, ViewGroup viewGroup) {
            TextView txtMesa;
            View view = getLayoutInflater().inflate(R.layout.modelo_mesa,null);
            txtMesa = view.findViewById(R.id.txtMesa);
            txtMesa.setText(txtNumMesa[i]);
            return view;
        }
    }

}