
package switch_get_name;

public class Switch_Get_Name {

    public static void main(String[] args) {
        int name=5;
        String nameString="";
        switch (name)
        {
            case 5:
                nameString="My name is Denis";
                break;
            case 10:
                nameString="My name is Moryne";
                break;
            default:
                System.out.println("Invalid Name");
        }
        System.out.println(nameString);
    }
}
