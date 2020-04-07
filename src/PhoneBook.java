import java.util.HashMap;

public class PhoneBook {
    // Key - information (name of organization or person name); value - number
    private HashMap<String, String> records;

    public PhoneBook() {
        records = new HashMap<>();
    }

    public void add(String info, String number) {
        records.putIfAbsent(info, number);
    }

    public void remove(String info) {
        records.remove(info);
    }

    public void changeInfo(String info, String newInfo) {
        String number = records.getOrDefault(info, null);
        if (number != null) {
            records.remove(info);
            records.putIfAbsent(newInfo, number);
        }
    }

    public void changeNumber(String info, String newNumber) {
        String number = records.getOrDefault(info, null);
        if (number != null) {
            records.replace(info, number, newNumber);
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Info | Number");
        for (String key: records.keySet()) {
            str.append("\n");
            str.append(key);
            str.append(" | ");
            str.append(records.get(key));
        }
        return str.toString();
    }
}
