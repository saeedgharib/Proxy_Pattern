/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package example1;


public class Proxy {

    public static void main(String[] args) {
        Image image = new VirtualProxyImage(".jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
