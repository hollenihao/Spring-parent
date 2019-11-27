package inject.basic;

public class Adders {
    String province;
    String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Adders{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
