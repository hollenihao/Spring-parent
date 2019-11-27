package inject.basic;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserInfo {
    Adders adders;
    String name;
    List<String> stringList;
   List<Adders> addersList;
   Set<String> stringSet;
   Map<String,Integer> map;
   Properties properties;



    public void setAdders(Adders adders) {
        this.adders = adders;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }



    public void setAddersList(List<Adders> addersList) {
        this.addersList = addersList;
    }



    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }



    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }



    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "adders=" + adders +
                ", name='" + name + '\'' +
                ", stringList=" + stringList +
                ", addersList=" + addersList +
                ", stringSet=" + stringSet +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
