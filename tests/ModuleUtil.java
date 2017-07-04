package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Control
     */
    public static View get_Control(Solo solo) {
        String ref = "Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Login
     */
    public static View get_Login(Solo solo) {
        String ref = "Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Record
     */
    public static View get_Record(Solo solo) {
        String ref = "Record";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Control/Control
     */
    public static View get_Control_Control(Solo solo) {
        String ref = "Control/Control";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Login/Login
     */
    public static View get_Login_Login(Solo solo) {
        String ref = "Login/Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Record/Record
     */
    public static View get_Record_Record(Solo solo) {
        String ref = "Record/Record";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Control/Control/Record_Animal
     */
    public static View get_Control_Control_RecordAnimal(Solo solo) {
        String ref = "Control/Control/Record_Animal";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Login/Login
     */
    public static View get_Login_Login_Login(Solo solo) {
        String ref = "Login/Login/Login";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Login/Login/Signup
     */
    public static View get_Login_Login_Signup(Solo solo) {
        String ref = "Login/Login/Signup";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Record/Record/Photo_Button_1
     */
    public static View get_Record_Record_PhotoButton1(Solo solo) {
        String ref = "Record/Record/Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Record/Record/Photo
     */
    public static View get_Record_Record_Photo(Solo solo) {
        String ref = "Record/Record/Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Login/Login/Users
     */
    public static View get_Login_Login_Users(Solo solo) {
        String ref = "Login/Login/Users";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Record/Record/Animal
     */
    public static View get_Record_Record_Animal(Solo solo) {
        String ref = "Record/Record/Animal";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: webview
        Ref:  Login/Login/Signup_Guide_1
     */
    public static View get_Login_Login_SignupGuide1(Solo solo) {
        String ref = "Login/Login/Signup_Guide_1";
        return (android.view.View) solo.getView((Object) ref);
    }
}
