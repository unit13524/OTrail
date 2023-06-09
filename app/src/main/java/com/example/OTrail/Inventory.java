/**
 * Programming 2 Oregon Trail Project
 * @author Alexander Casada
 * @since March 28, 2023
 *
 * Description: This java Inventory class stores all the player's
 * items along the Oregon Trail that they will buy or use. This class
 * also can check to make sure the player's wagon will be able to
 * move along the Oregon Trail.
 */
package com.example.OTrail;
import java.util.Random;
public class Inventory
{
    private int playerMoneyCount = 1600;
    private int foodCount = 0;
    private int clothingCount = 0;
    private int bulletsCount = 0;
    private int oxenCount = 0;
    private int wagonWheelCount = 4;
    private int wagonAxleCount = 2;
    private int wagonTongueCount = 1;
    private int medicalSupplyCount = 0;
    private boolean wagonUsable = false;
    private String tradeList[] = {
            "-5 clothes, + wheel",
            "-5 clothes, + Axle",
            "-5 clothes, + Tongue",
            "-1 oxen, +5 clothes",
            "-20 food, +2 clothes",
            "-wheel, + Tongue",
            "-wheel, + axle",
            "-axle, + wheel",
            "-axle, + tongue",
            "-tongue, + wheel"};

    /**
     * Default constructor for the Inventory class.
     */
    public Inventory()
    {

    }

    /**
     * Checks to make sure the wagon is usable.
     *
     * @return true if the wagon is usable
     */
    public boolean isWagonUsable()
    {
        if (wagonWheelCount >= 4 && wagonAxleCount >= 2 && wagonTongueCount >= 1 && oxenCount >= 1)
        {
            wagonUsable = true;
        }
        else
        {
            wagonUsable = false;
        }

        return wagonUsable;
    }

    /**
     * Gets the player's amount of money.
     *
     * @return The player's current amount of money.
     */
    public int getPlayerMoneyCount()
    {
        return playerMoneyCount;
    }

    /**
     * Gets the player's amount of food.
     *
     * @return The player's current amount of food.
     */
    public int getFoodCount()
    {
        return foodCount;
    }

    /**
     * Gets the player's number of clothing sets.
     *
     * @return The player's current number of clothing sets.
     */
    public int getClothingCount()
    {
        return clothingCount;
    }

    /**
     * Gets the player's number of bullets.
     *
     * @return The player's current number of bullets.
     */
    public int getBulletsCount()
    {
        return bulletsCount;
    }

    /**
     * Gets the player's number of oxen.
     *
     * @return The player's current number of oxen.
     */
    public int getOxenCount()
    {
        return oxenCount;
    }

    /**
     * Gets the player's number of wagon wheels.
     *
     * @return The player's current number of wagon wheels.
     */
    public int getWagonWheelCount()
    {
        return wagonWheelCount;
    }

    /**
     * Gets the player's number of wagon axles.
     *
     * @return The player's current number of wagon axles.
     */
    public int getWagonAxleCount()
    {
        return wagonAxleCount;
    }

    /**
     * Gets the player's number of wagon tongues.
     *
     * @return The player's current number of wagon tongues.
     */
    public int getWagonTongueCount()
    {
        return wagonTongueCount;
    }

    /**
     * Gets the player's number of medical supplies.
     *
     * @return The player's current amount of medical supplies.
     */
    public int getMedicalSupplyCount()
    {
        return medicalSupplyCount;
    }

    /**
     * Gets the player's wagon status.
     *
     * @return True if the player's wagon in usable.
     */
    public boolean getWagonUsableStatus()
    {
        return wagonUsable;
    }

    /**
     * Sets the player's amount of money.
     *
     * @param playerMoneyCount The player's updated amount of money.
     */
    public void setPlayerMoneyCount(int playerMoneyCount)
    {
        this.playerMoneyCount = playerMoneyCount;
    }

    /**
     * Sets the player's amount of food.
     *
     * @param foodCount The player's updated amount of food.
     */
    public void setFoodCount(int foodCount)
    {
        this.foodCount = this.foodCount + foodCount;
    }

    /**
     * Sets the player's number of clothing sets.
     *
     * @param clothingCount The player's updated number of clothing sets.
     */
    public void setClothingCount(int clothingCount)
    {
        this.clothingCount = this.clothingCount + clothingCount;
    }

    /**
     * Sets the player's number of bullets.
     *
     * @param bulletsCount The player's updated number of bullets.
     */
    public void setBulletsCount(int bulletsCount)
    {
        this.bulletsCount = this.bulletsCount + bulletsCount;
    }

    /**
     * Sets the player's number of oxen.
     *
     * @param oxenCount The player's updated number of oxen.
     */
    public void setOxenCount(int oxenCount)
    {
        this.oxenCount = this.oxenCount + oxenCount;
    }

    /**
     * Sets the player's number of wagon wheels.
     *
     * @param wagonWheelCount The player's updated number of wagon wheels.
     */
    public void setWagonWheelCount(int wagonWheelCount)
    {
        this.wagonWheelCount = this.wagonWheelCount + wagonWheelCount;
    }

    /**
     * Sets the player's number of wagon axles.
     *
     * @param wagonAxleCount The player's updated number of wagon axles.
     */
    public void setWagonAxleCount(int wagonAxleCount)
    {
        this.wagonAxleCount = this.wagonAxleCount + wagonAxleCount;
    }

    /**
     * Sets the player's number of wagon tongues.
     *
     * @param wagonTongueCount The player's updated number of wagon tongues.
     */
    public void setWagonTongueCount(int wagonTongueCount)
    {
        this.wagonTongueCount = this.wagonTongueCount + wagonTongueCount;
    }

    /**
     * Sets the player's number of medical supplies.
     *
     * @param medicalSupplyCount The player's updated amount of medical supplies.
     */
    public void setMedicalSupplyCount(int medicalSupplyCount)
    {
        this.medicalSupplyCount = this.medicalSupplyCount + medicalSupplyCount;
    }

    /**
     * This method lists all the player's items that they currently have.
     */
    public void getAllItems()
    {
        System.out.println("Your Items: \nPounds of Food = " + foodCount + "\nClothingSets = " + clothingCount + "\nNumber of Bullets = "
                + bulletsCount + "\nNumber of Oxen = " + oxenCount + "\nNumber of Wagon Wheels = " + wagonWheelCount + "\nNumber of Wagon Axels = "
                + wagonAxleCount +"\nNumber of Wagon Tongues = " + wagonTongueCount +"\nNumber of Medical Supplies = " + medicalSupplyCount);
    }

    /**canTrade(Map map)
     * tries to create a trade.
     * @param map The current map object, used for doing location checks
     * @return -1 if no trade, the trade number if there is one availible
     */
    public int getTrade(Map map){
        Random rand =  new Random();
        int chance = rand.nextInt(100);
        if (map.getDistFromLM() == 0 || map.getDistToLM() == 0){
            return rand.nextInt(10);
        }
        else if (chance<6){
            return rand.nextInt(10);
        }
        else return -1;
    }

    /**getTrade(int tradeNumber)
     * shares the exact trade to be done
     * @param tradeNumber The trade to be received
     * @return a string with the data of the trade
     * */
    public String getTrade(int tradeNumber){
        return tradeList[tradeNumber];
    }

    /**confirmTrade(boolean answer, int tradeNumber)
     * confirms the trade by taking in an input asking if the trade is ok
     * */
    public void confirmTrade(boolean answer, int trade){
        switch (trade){
            case 0: if (this.clothingCount >= 5){
                this.clothingCount -= 5;
                this.wagonWheelCount++;
            }
            else break;
            case 1: if (this.clothingCount >= 5){
                this.clothingCount -= 5;
                this.wagonAxleCount++;
            }
            else break;
            case 2: if (this.clothingCount >= 5){
                this.clothingCount -= 5;
                this.wagonTongueCount++;
            }
            else break;
            case 3: if (this.oxenCount > 1){
                this.oxenCount--;
                this.clothingCount += 5;
            }
            else break;
            case 4: if (this.foodCount > 20){
                this.foodCount -= 20;
                this.clothingCount += 2;
            }
            else break;
            case 5: if (this.wagonWheelCount > 4){
                this.wagonWheelCount--;
                this.wagonTongueCount++;
            }
            else break;
            case 6: if (this.wagonWheelCount > 4){
                this.wagonWheelCount--;
                this.wagonAxleCount++;
            }
            else break;
            case 7: if (this.wagonAxleCount > 2){
                this.wagonAxleCount--;
                this.wagonWheelCount++;
            }
            else break;
            case 8: if (this.wagonAxleCount > 2){
                this.wagonAxleCount--;
                this.wagonTongueCount++;
            }
            else break;
            case 9: if (this.wagonTongueCount > 1){
                this.wagonTongueCount--;
                this.wagonWheelCount++;
            }
            else break;
            default:break;
        }
    }
}