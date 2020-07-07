package org.net;

import java.util.*;

public class Set 
{
public static void main(String[] args)
{
List<Integer> l=new ArrayList<Integer>();
l.add(12);
l.add(14);
l.add(16);
System.out.println("first one list :"  + l);

java.util.Set<Integer> s=new HashSet<Integer>();
s.addAll(l);
s.add(17);
s.add(19);
System.out.println("second one  set : " + s);
s.remove(12);
s.remove(14);
System.out.println("after remove : " + s);
for (Integer r : s) 
{
System.out.println(r);	
}
}
}
