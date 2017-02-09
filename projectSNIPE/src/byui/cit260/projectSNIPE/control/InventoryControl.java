/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

/**
 *
 * @author JadeJ
 */
public class InventoryControl {
public double calcNewMoney(double money, double exchangeRate){
    if (money <1 || money >1000){
        return -1;
        }
    if (exchangeRate < 0 || exchangeRate >60){
        return -1;
        }
double newMoney = (money * exchangeRate) * 0.95;
return newMoney;
        } 
}
