package liuyu.com.latte_core.app;

import android.content.Context;

import java.util.HashMap;

/**
 * 创建日期：2018/4/12
 * 描述:
 * 作者:LiuYu
 */
public final class Latte {

    public static Configurator init(Context context){
        getConfigurations().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();
    }

    private static HashMap<String,Object> getConfigurations(){
      return Configurator.getInstance().getLatteConfigs();
    }

    public static Context getApplication(){
        return (Context) getConfigurations().get(ConfigType.APPLICATION_CONTEXT.name());
    }


}
