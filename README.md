# MapEditor 地圖編輯器模組
* 功能：
    1. 能夠存取編輯的地圖檔案(txt檔、bmp檔)
    2. 能創建新的地圖檔案




*地圖產生器操作說明：
1. 畫面說明

![](https://i.imgur.com/FUKBoX0.png)
   
![](https://i.imgur.com/jRD4Q7m.png)
      
2. 操作說明

   1. 地圖參數設定

      ![](https://i.imgur.com/co1IpzC.png)



      此區域設定每格的單位，以及地圖檔的長寬尺寸，設定後按下設置按鈕，在右方地圖編輯畫布區域會建立出對應格線。

   2. 素材編輯區域
   
       ![](https://i.imgur.com/9wrr6yP.png)

      1. 點選選擇素材按鈕，點選後跳出檔案選擇視窗，選擇對應素材檔案。
      2. 輸入素材名稱
      3. 設定素材寬、高(單位格數)
      4. 選擇素材對應顏色
      5. 按下新增按鈕，則素材編輯區會出現此素材

 

   3. 地圖繪製方式

        ![](https://i.imgur.com/vdLkfOh.png)


      點選左方素材圖片後，在右方點選要畫的的格子。 

   4. 地圖清除編輯

        ![](https://i.imgur.com/ZAcXjy2.png)

      若繪製錯誤，可點選清除按鈕 ，在地圖編輯畫布區域點選的地方便會清除繪製。 
  
    5. 地圖檔案輸出

        ![](https://i.imgur.com/keerYHO.png)


          若已完成地圖編輯，則點選上面圖示按鈕，跳出資料夾選擇視窗，在選擇資料夾後會輸出bmp檔、txt檔案。




   6. 地圖檔案載入 

        ![](https://i.imgur.com/qaVeYHA.png)

      若需載入地圖，則點選上面圖示按鈕，跳出資料夾選擇視窗，選擇資料夾後，會將對應名稱的兩個檔案讀入。


   7. 地圖繪圖區域縮放 

        ![](https://i.imgur.com/fLtgHpr.png)


      點選加號放大鏡，放大。
      點選減號放大鏡，縮小。

 


---


# MapLoader 地圖載入模組

* 功能：
1.載入已編輯地圖bmp和txt檔
2.提供接口給其他類別



使用方法:
1. 
    
```java
// 讀入 txt bmp 檔 並輸出成 ArrayList<MapInfo>
ArrayList<MapInfo> mapInfo = new MapLoader("genMap.bmp", "genMap.txt").combineInfo();

```
2. 
    
```java
// 使用範例
    private void mapInitialize() {//建構地圖物件的函式
    
    // 讀入 bmp 和 txt 檔案
        try {
        
        // 使用 combineInfo() 讀入 bmp 和 txt 檔案，並輸出成 ArrayList<MapInfo>
            ArrayList<MapInfo> mapInfo = new MapLoader("genMap.bmp", "genMap.txt").combineInfo();
            // 迴圈讀過所有 ArrayList<MapInfo> 產生物件
            // 地圖產生器內物件的 {素材名稱, X 座標 , Y 座標, 素材寬度 , 素材高}
            for (MapInfo tmp : mapInfo) {  
                switch (tmp.getName()) {
                    case "Name":   
                        units.add(new CBrick(UNIT_X * tmp.getX() + UNIT_X * tmp.getSizeX() / 2,
                                UNIT_Y * tmp.getY() + UNIT_Y * tmp.getSizeY() / 2,
                                UNIT_X, UNIT_Y));
                        break;
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(MainScene.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
```


| function   | 功能                 |
| ---------- | -------------------- |
| combineInfo() | 讀取已儲存的地圖檔案 |




* Class MapInfo 說明：
MapInfo 內含 5 個屬性(素材名稱, X 座標 , Y 座標, 素材寬度 , 素材高)


* 舉例：
![](https://i.imgur.com/kNf72vw.png)



* MapLoader展示：
![](https://i.imgur.com/cGgn6bp.png)

