
package map.creator;


public class MapChecker {
  
    
    public static boolean chekMapChracter(String map)
    {
        String allchar = "P10EC\n";
    for (char c : map.toUpperCase().toCharArray())
    {
        if (!allchar.contains(c + ""))
            return false;
        
    }
    return true;
    }
    
    public static boolean  CheckPlayer(String map)
    {
        int num = 0;
        for (char c : map.toUpperCase().toCharArray())
        {
               if (c == 'P')
                   num++;
               if (num > 1)
                   return false;
        }
        if (num == 1)
            return true;
        else 
            return false;
    
    }  
    public static boolean chekRow(String[] rows)
    {
        int len = rows[0].length();
        for (String str : rows)
        {
            if (str.length() != len)
                return false;
        }
        return true;
    }
}
