package util.homemade.demo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Narayan on 02/02/2017.
 */
public class SharedFile {

    SharedPreferences sp;
    private static final String TAG="USERNAME";

    public SharedFile(Context context){
        sp = context.getSharedPreferences("SavedNames",context.MODE_PRIVATE);


    }

    public void putName(String name){
        SharedPreferences.Editor ed = sp.edit();
        ed.putString(TAG,name);
        ed.putInt("Turn",1);
        ed.commit();
    }

    public String getName(){
        return  sp.getString(TAG,null);
    }

    public boolean findOut(){
        int num = sp.getInt("Turn",0);
        if (num == 1){
            return true;
        }else{
            return false;
        }
    }
}
