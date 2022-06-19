class Solution {
      public List<List<String>> suggestedProducts(String[] products, String searchWord) {
      int lenWord = searchWord.length();
      List<List<String>> list = new ArrayList<>();
        
      int lenProducts= products.length;
      Arrays.sort(products);  
        
        
      for(int i =0; i < lenWord ; i++)  
      {
          String s = searchWord.substring(0,i+1);
          //System.out.println(i + ": " +s);
          List<String> list1 = new ArrayList<>();
          for(String product : products)
          {
              if(product.startsWith(s) && list1.size() <3)
              {
                  list1.add(product);
              }
          }
          list.add(list1);
      }
      
      return list;  
    }
}