package com.example.shuser.soundboard;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ImageAdapter extends BaseAdapter {

    int itmightwork=0;




    private Context mContext;

    public ImageAdapter(Context c,int alloat) {
        mContext = c;
        itmightwork=alloat;
    }

    public int getCount() {
        if(itmightwork!=0) {
            return mThumbIds.length;
        }
        else return mThumbIdsAll.length;
    }

    public Object getItem(int position) {
        return mThumbIds[position];
    }

    public long getItemId(int position) {
        return position;
    }

    // create a new ImageView for each item referenced by the Adapter
    // public View getView(int position, View convertView, ViewGroup parent) {
    // ImageView imageView;
    // if (convertView == null) {
    // // if it's not recycled, initialize some attributes
    // imageView = new ImageView(mContext);
    // imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
    // imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    // imageView.setPadding(8, 8, 8, 8);
    // } else {
    // imageView = (ImageView) convertView;
    // }
    //
    // imageView.setImageResource(mThumbIds[position]);
    // return imageView;
    // }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub

        View grid;

        if (convertView == null) {
            grid = new View(mContext);
            //LayoutInflater inflater = getLayoutInflater();
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
            grid = inflater.inflate(R.layout.adapter, parent, false);
        } else {
            grid = (View) convertView;
        }

        ImageView imageView = (ImageView) grid.findViewById(R.id.imagepart);
        TextView textView = (TextView) grid.findViewById(R.id.textpart);



        if(itmightwork==0){
            imageView.setImageResource(mThumbIdsAll[position]);
            textView.setText(PerAll[position]);

        }
        if(itmightwork==1){
            textView.setText(Per1[position]);
            imageView.setImageResource(mThumbIds[position]);
        }
        if(itmightwork==2){
            textView.setText(Per2[position]);
            imageView.setImageResource(mThumbIds[position]);
        }
        if(itmightwork==3){
            textView.setText(Per3[position]);
            imageView.setImageResource(mThumbIds[position]);
        }
        if(itmightwork==4){
            textView.setText(Per4[position]);
            imageView.setImageResource(mThumbIds[position]);
        }
        if(itmightwork==5){
            textView.setText(Per5[position]);
            imageView.setImageResource(mThumbIds[position]);
        }
      /*  if(itmightwork==6){
            textView.setText(Per6[position]);
            imageView.setImageResource(mThumbIds[position]);
        }
*/

        return grid;
    }



    public String[] PerAll ={

            "all dead" , "brutal, savage, rekt" ,"tian huo","это. просто. нечто.","боже, ты посмотри вокруг...","easiest money","it`s a disistah","lakat matataaaag","patience from Zhou","goddamn hero","нисибусие","ой ой ой ой",
            "charge" , "crash & burn" ,"crowd","crybaby","ЭТО ГГ","FROG","headshake","drumroll","ай ай ай, что произошло","бежать","ti e la","это ненормально",
            "что это" , "а как иначе" ,"анулировал","дадада","ya catch u","горе","help","и что","бесишь","ладно","шо?","здарова",
            "crickets" , "nope" ,"fatality","hello, darkness","ba dum tsss","big boy","noooo","sad trombone","ha-ha!","they ask u...","snoop","trololo",
            "de ja vu" , "bite" ,"kono dio da","no problem des","over 9000","betelgeuse","punch","sugoi","tuturu","to be continued","yes-yes-yes","za warudo"};


    public String[] Per1  = { "all dead" , "brutal, savage, rekt" ,"tian huo","это. просто. нечто.","боже, ты посмотри вокруг...","easiest money","it`s a disistah","lakat matataaaag","patience from Zhou","goddamn hero","нисибусие","ой ой ой ой",};
    public String[] Per2  = { "charge" , "crash & burn" ,"crowd","crybaby","ЭТО ГГ","FROG","headshake","drumroll","ай ай ай, что произошло","бежать","ti e la","это ненормально",};
    public String[] Per3  = {"что это" , "а как иначе" ,"анулировал","дадада","ya catch u","горе","help","и что","бесишь","ладно","шо?","здарова"};
    public String[] Per4  = {  "crickets" , "nope" ,"fatality","hello, darkness","ba dum tsss","big boy","noooo","sad trombone","ha-ha!","they ask u...","snoop","trololo",};
    public String[] Per5  = {  "de ja vu" , "bite" ,"kono dio da","no problem des","over 9000","betelgeuse","punch","sugoi","tuturu","to be continued","yes-yes-yes","za warudo"};


    public Integer[] mThumbIds = {
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon};


    public Integer[] mThumbIdsAll = {
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon

    };
}
