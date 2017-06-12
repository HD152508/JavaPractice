/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 6. 5.
 * </pre>
 *
 * @author : KHH
 * @version : 1.0
 */
public class MelonGenreChart {

	   public static void main(String[] args) {
	      List<Music> list1 = new ArrayList<Music>();
	      list1.add(new Music("팔레트","아이유"));
	      
	      
	      List<Music> list2 = new ArrayList<Music>();
	      list2.add(new Music("I LUV IT","PSY"));
	      list2.add(new Music("맞지","언니쓰"));
	      
	      Map<String, List<Music>> map = new HashMap<String, List<Music>>();
	      map.put("[발라드]", list1);
	      map.put("[댄스]", list2);
	      
	      System.out.println("-- << 멜론 장르별 차트 >> --");
	      printMap(map);
	      System.out.println();
	      
	      System.out.println("-- << 댄스 2위 곡 변경 >> --");
	      list2.set(1, new Music("SIGNAL","트와이스"));
	      printMap(map);
	      System.out.println();
	      
	      System.out.println("-- << 댄스 1위 곡 삭제 >> --");
	      list2.remove(0);
	      printMap(map);
	      System.out.println();
	      
	      System.out.println("-- << 전체 리스트 삭제 >> --");
	      map.clear();
	      printMap(map);
	      System.out.println();
	      
	   }
	   public static void printMap(Map<String, List<Music>> map){
	      for (Map.Entry<String, List<Music>> entry : map.entrySet()){
	         System.out.println(entry.getKey());
	         int i = 1;
	         for(Music m : entry.getValue() ){
	            System.out.println(i+ ". " + m.toString());
	            i++;
	         }
	      }

	   }
	}