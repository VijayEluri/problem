import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Two {
	InputStreamReader inp = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(inp);
	boolean test = true;

//	private String[] inData = { "4","2 10","0 20","1 5","1 3" };
	private String[] inData = { "200",
			"2 32",
			"3 32",
			"4 32",
			"5 32",
			"6 32",
			"7 32",
			"8 32",
			"9 32",
			"10 32",
			"11 32",
			"12 32",
			"13 32",
			"14 32",
			"15 32",
			"16 32",
			"17 32",
			"18 32",
			"19 32",
			"20 32",
			"21 32",
			"22 32",
			"23 32",
			"24 32",
			"25 32",
			"26 32",
			"27 32",
			"28 32",
			"29 32",
			"30 32",
			"31 32",
			"32 32",
			"33 32",
			"34 32",
			"35 32",
			"36 32",
			"37 32",
			"38 32",
			"39 32",
			"40 32",
			"41 32",
			"42 32",
			"43 32",
			"44 32",
			"45 32",
			"46 32",
			"47 32",
			"48 32",
			"49 32",
			"50 32",
			"51 32",
			"52 32",
			"53 32",
			"54 32",
			"55 32",
			"56 32",
			"57 32",
			"58 32",
			"59 32",
			"60 32",
			"61 32",
			"62 32",
			"63 32",
			"64 32",
			"65 32",
			"66 32",
			"67 32",
			"68 32",
			"69 32",
			"70 32",
			"71 32",
			"72 32",
			"73 32",
			"74 32",
			"75 32",
			"76 32",
			"77 32",
			"78 32",
			"79 32",
			"80 32",
			"81 32",
			"82 32",
			"83 32",
			"84 32",
			"85 32",
			"86 32",
			"87 32",
			"88 32",
			"89 32",
			"90 32",
			"91 32",
			"92 32",
			"93 32",
			"94 32",
			"95 32",
			"96 32",
			"97 32",
			"98 32",
			"99 32",
			"100 32",
			"101 32",
			"102 32",
			"103 32",
			"104 32",
			"105 32",
			"106 32",
			"107 32",
			"108 32",
			"109 32",
			"110 32",
			"111 32",
			"112 32",
			"113 32",
			"114 32",
			"115 32",
			"116 32",
			"117 32",
			"118 32",
			"119 32",
			"120 32",
			"121 32",
			"122 32",
			"123 32",
			"124 32",
			"125 32",
			"126 32",
			"127 32",
			"128 32",
			"129 32",
			"130 32",
			"131 32",
			"132 32",
			"133 32",
			"134 32",
			"135 32",
			"136 32",
			"137 32",
			"138 32",
			"139 32",
			"140 32",
			"141 32",
			"142 32",
			"143 32",
			"144 32",
			"145 32",
			"146 32",
			"147 32",
			"148 32",
			"149 32",
			"150 32",
			"151 32",
			"152 32",
			"153 32",
			"154 32",
			"155 32",
			"156 32",
			"157 32",
			"158 32",
			"159 32",
			"160 32",
			"161 32",
			"162 32",
			"163 32",
			"164 32",
			"165 32",
			"166 32",
			"167 32",
			"168 32",
			"169 32",
			"170 32",
			"171 32",
			"172 32",
			"173 32",
			"174 32",
			"175 32",
			"176 32",
			"177 32",
			"178 32",
			"179 32",
			"180 32",
			"181 32",
			"182 32",
			"183 32",
			"184 32",
			"185 32",
			"186 32",
			"187 32",
			"188 32",
			"189 32",
			"190 32",
			"191 32",
			"192 32",
			"193 32",
			"194 32",
			"195 32",
			"196 32",
			"197 32",
			"198 32",
			"199 32",
			"200 32",
			"201 32",
			"202 32",
			"203 32",
			"204 32",
			"205 32",
			"206 32",
			"207 32",
			"208 32",
			"209 32",
			"210 32",
			"211 32",
			"212 32",
			"213 32",
			"214 32",
			"215 32",
			"216 32",
			"217 32",
			"218 32",
			"219 32",
			"220 32",
			"221 32",
			"222 32",
			"223 32",
			"224 32",
			"225 32",
			"226 32",
			"227 32",
			"228 32",
			"229 32",
			"230 32",
			"231 32",
			"232 32",
			"233 32",
			"234 32",
			"235 32",
			"236 32",
			"237 32",
			"238 32",
			"239 32",
			"240 32",
			"241 32",
			"242 32",
			"243 32",
			"244 32",
			"245 32",
			"246 32",
			"247 32",
			"248 32",
			"249 32",
			"250 32",
			"251 32",
			"252 32",
			"253 32",
			"254 32",
			"255 32",
			"256 32",
			"257 32",
			"258 32",
			"259 32",
			"260 32",
			"261 32",
			"262 32",
			"263 32",
			"264 32",
			"265 32",
			"266 32",
			"267 32",
			"268 32",
			"269 32",
			"270 32",
			"271 32",
			"272 32",
			"273 32",
			"274 32",
			"275 32",
			"276 32",
			"277 32",
			"278 32",
			"279 32",
			"280 32",
			"281 32",
			"282 32",
			"283 32",
			"284 32",
			"285 32",
			"286 32",
			"287 32",
			"288 32",
			"289 32",
			"290 32",
			"291 32",
			"292 32",
			"293 32",
			"294 32",
			"295 32",
			"296 32",
			"297 32",
			"298 32",
			"299 32",
			"300 32",
			"301 32",
			"302 32",
			"303 32",
			"304 32",
			"305 32",
			"306 32",
			"307 32",
			"308 32",
			"309 32",
			"310 32",
			"311 32",
			"312 32",
			"313 32",
			"314 32",
			"315 32",
			"316 32",
			"317 32",
			"318 32",
			"319 32",
			"320 32",
			"321 32",
			"322 32",
			"323 32",
			"324 32",
			"325 32",
			"326 32",
			"327 32",
			"328 32",
			"329 32",
			"330 32",
			"331 32",
			"332 32",
			"333 32",
			"334 32",
			"335 32",
			"336 32",
			"337 32",
			"338 32",
			"339 32",
			"340 32",
			"341 32",
			"342 32",
			"343 32",
			"344 32",
			"345 32",
			"346 32",
			"347 32",
			"348 32",
			"349 32",
			"350 32",
			"351 32",
			"352 32",
			"353 32",
			"354 32",
			"355 32",
			"356 32",
			"357 32",
			"358 32",
			"359 32",
			"360 32",
			"361 32",
			"362 32",
			"363 32",
			"364 32",
			"365 32",
			"366 32",
			"367 32",
			"368 32",
			"369 32",
			"370 32",
			"371 32",
			"372 32",
			"373 32",
			"374 32",
			"375 32",
			"376 32",
			"377 32",
			"378 32",
			"379 32",
			"380 32",
			"381 32",
			"382 32",
			"383 32",
			"384 32",
			"385 32",
			"386 32",
			"387 32",
			"388 32",
			"389 32",
			"390 32",
			"391 32",
			"392 32",
			"393 32",
			"394 32",
			"395 32",
			"396 32",
			"397 32",
			"398 32",
			"399 32",
			"400 32",
			"401 32",
			"402 32",
			"403 32",
			"404 32",
			"405 32",
			"406 32",
			"407 32",
			"408 32",
			"409 32",
			"410 32",
			"411 32",
			"412 32",
			"413 32",
			"414 32",
			"415 32",
			"416 32",
			"417 32",
			"418 32",
			"419 32",
			"420 32",
			"421 32",
			"422 32",
			"423 32",
			"424 32",
			"425 32",
			"426 32",
			"427 32",
			"428 32",
			"429 32",
			"430 32",
			"431 32",
			"432 32",
			"433 32",
			"434 32",
			"435 32",
			"436 32",
			"437 32",
			"438 32",
			"439 32",
			"440 32",
			"441 32",
			"442 32",
			"443 32",
			"444 32",
			"445 32",
			"446 32",
			"447 32",
			"448 32",
			"449 32",
			"450 32",
			"451 32",
			"452 32",
			"453 32",
			"454 32",
			"455 32",
			"456 32",
			"457 32",
			"458 32",
			"459 32",
			"460 32",
			"461 32",
			"462 32",
			"463 32",
			"464 32",
			"465 32",
			"466 32",
			"467 32",
			"468 32",
			"469 32",
			"470 32",
			"471 32",
			"472 32",
			"473 32",
			"474 32",
			"475 32",
			"476 32",
			"477 32",
			"478 32",
			"479 32",
			"480 32",
			"481 32",
			"482 32",
			"483 32",
			"484 32",
			"485 32",
			"486 32",
			"487 32",
			"488 32",
			"489 32",
			"490 32",
			"491 32",
			"492 32",
			"493 32",
			"494 32",
			"495 32",
			"496 32",
			"497 32",
			"498 32",
			"499 32",
			"500 32",
			"501 32",
			"502 32",
			"503 32",
			"504 32",
			"505 32",
			"506 32",
			"507 32",
			"508 32",
			"509 32",
			"510 32",
			"511 32",
			"512 32",
			"513 32",
			"514 32",
			"515 32",
			"516 32",
			"517 32",
			"518 32",
			"519 32",
			"520 32",
			"521 32",
			"522 32",
			"523 32",
			"524 32",
			"525 32",
			"526 32",
			"527 32",
			"528 32",
			"529 32",
			"530 32",
			"531 32",
			"532 32",
			"533 32",
			"534 32",
			"535 32",
			"536 32",
			"537 32",
			"538 32",
			"539 32",
			"540 32",
			"541 32",
			"542 32",
			"543 32",
			"544 32",
			"545 32",
			"546 32",
			"547 32",
			"548 32",
			"549 32",
			"550 32",
			"551 32",
			"552 32",
			"553 32",
			"554 32",
			"555 32",
			"556 32",
			"557 32",
			"558 32",
			"559 32",
			"560 32",
			"561 32",
			"562 32",
			"563 32",
			"564 32",
			"565 32",
			"566 32",
			"567 32",
			"568 32",
			"569 32",
			"570 32",
			"571 32",
			"572 32",
			"573 32",
			"574 32",
			"575 32",
			"576 32",
			"577 32",
			"578 32",
			"579 32",
			"580 32",
			"581 32",
			"582 32",
			"583 32",
			"584 32",
			"585 32",
			"586 32",
			"587 32",
			"588 32",
			"589 32",
			"590 32",
			"591 32",
			"592 32",
			"593 32",
			"594 32",
			"595 32",
			"596 32",
			"597 32",
			"598 32",
			"599 32",
			"600 32",
			"601 32",
			"602 32",
			"603 32",
			"604 32",
			"605 32",
			"606 32",
			"607 32",
			"608 32",
			"609 32",
			"610 32",
			"611 32",
			"612 32",
			"613 32",
			"614 32",
			"615 32",
			"616 32",
			"617 32",
			"618 32",
			"619 32",
			"620 32",
			"621 32",
			"622 32",
			"623 32",
			"624 32",
			"625 32",
			"626 32",
			"627 32",
			"628 32",
			"629 32",
			"630 32",
			"631 32",
			"632 32",
			"633 32",
			"634 32",
			"635 32",
			"636 32",
			"637 32",
			"638 32",
			"639 32",
			"640 32",
			"641 32",
			"642 32",
			"643 32",
			"644 32",
			"645 32",
			"646 32",
			"647 32",
			"648 32",
			"649 32",
			"650 32",
			"651 32",
			"652 32",
			"653 32",
			"654 32",
			"655 32",
			"656 32",
			"657 32",
			"658 32",
			"659 32",
			"660 32",
			"661 32",
			"662 32",
			"663 32",
			"664 32",
			"665 32",
			"666 32",
			"667 32",
			"668 32",
			"669 32",
			"670 32",
			"671 32",
			"672 32",
			"673 32",
			"674 32",
			"675 32",
			"676 32",
			"677 32",
			"678 32",
			"679 32",
			"680 32",
			"681 32",
			"682 32",
			"683 32",
			"684 32",
			"685 32",
			"686 32",
			"687 32",
			"688 32",
			"689 32",
			"690 32",
			"691 32",
			"692 32",
			"693 32",
			"694 32",
			"695 32",
			"696 32",
			"697 32",
			"698 32",
			"699 32",
			"700 32",
			"701 32",
			"702 32",
			"703 32",
			"704 32",
			"705 32",
			"706 32",
			"707 32",
			"708 32",
			"709 32",
			"710 32",
			"711 32",
			"712 32",
			"713 32",
			"714 32",
			"715 32",
			"716 32",
			"717 32",
			"718 32",
			"719 32",
			"720 32",
			"721 32",
			"722 32",
			"723 32",
			"724 32",
			"725 32",
			"726 32",
			"727 32",
			"728 32",
			"729 32",
			"730 32",
			"731 32",
			"732 32",
			"733 32",
			"734 32",
			"735 32",
			"736 32",
			"737 32",
			"738 32",
			"739 32",
			"740 32",
			"741 32",
			"742 32",
			"743 32",
			"744 32",
			"745 32",
			"746 32",
			"747 32",
			"748 32",
			"749 32",
			"750 32",
			"751 32",
			"752 32",
			"753 32",
			"754 32",
			"755 32",
			"756 32",
			"757 32",
			"758 32",
			"759 32",
			"760 32",
			"761 32",
			"762 32",
			"763 32",
			"764 32",
			"765 32",
			"766 32",
			"767 32",
			"768 32",
			"769 32",
			"770 32",
			"771 32",
			"772 32",
			"773 32",
			"774 32",
			"775 32",
			"776 32",
			"777 32",
			"778 32",
			"779 32",
			"780 32",
			"781 32",
			"782 32",
			"783 32",
			"784 32",
			"785 32",
			"786 32",
			"787 32",
			"788 32",
			"789 32",
			"790 32",
			"791 32",
			"792 32",
			"793 32",
			"794 32",
			"795 32",
			"796 32",
			"797 32",
			"798 32",
			"799 32",
			"800 32",
			"801 32",
			"802 32",
			"803 32",
			"804 32",
			"805 32",
			"806 32",
			"807 32",
			"808 32",
			"809 32",
			"810 32",
			"811 32",
			"812 32",
			"813 32",
			"814 32",
			"815 32",
			"816 32",
			"817 32",
			"818 32",
			"819 32",
			"820 32",
			"821 32",
			"822 32",
			"823 32",
			"824 32",
			"825 32",
			"826 32",
			"827 32",
			"828 32",
			"829 32",
			"830 32",
			"831 32",
			"832 32",
			"833 32",
			"834 32",
			"835 32",
			"836 32",
			"837 32",
			"838 32",
			"839 32",
			"840 32",
			"841 32",
			"842 32",
			"843 32",
			"844 32",
			"845 32",
			"846 32",
			"847 32",
			"848 32",
			"849 32",
			"850 32",
			"851 32",
			"852 32",
			"853 32",
			"854 32",
			"855 32",
			"856 32",
			"857 32",
			"858 32",
			"859 32",
			"860 32",
			"861 32",
			"862 32",
			"863 32",
			"864 32",
			"865 32",
			"866 32",
			"867 32",
			"868 32",
			"869 32",
			"870 32",
			"871 32",
			"872 32",
			"873 32",
			"874 32",
			"875 32",
			"876 32",
			"877 32",
			"878 32",
			"879 32",
			"880 32",
			"881 32",
			"882 32",
			"883 32",
			"884 32",
			"885 32",
			"886 32",
			"887 32",
			"888 32",
			"889 32",
			"890 32",
			"891 32",
			"892 32",
			"893 32",
			"894 32",
			"895 32",
			"896 32",
			"897 32",
			"898 32",
			"899 32",
			"900 32",
			"901 32",
			"902 32",
			"903 32",
			"904 32",
			"905 32",
			"906 32",
			"907 32",
			"908 32",
			"909 32",
			"910 32",
			"911 32",
			"912 32",
			"913 32",
			"914 32",
			"915 32",
			"916 32",
			"917 32",
			"918 32",
			"919 32",
			"920 32",
			"921 32",
			"922 32",
			"923 32",
			"924 32",
			"925 32",
			"926 32",
			"927 32",
			"928 32",
			"929 32",
			"930 32",
			"931 32",
			"932 32",
			"933 32",
			"934 32",
			"935 32",
			"936 32",
			"937 32",
			"938 32",
			"939 32",
			"940 32",
			"941 32",
			"942 32",
			"943 32",
			"944 32",
			"945 32",
			"946 32",
			"947 32",
			"948 32",
			"949 32",
			"950 32",
			"951 32",
			"952 32",
			"953 32",
			"954 32",
			"955 32",
			"956 32",
			"957 32",
			"958 32",
			"959 32",
			"960 32",
			"961 32",
			"962 32",
			"963 32",
			"964 32",
			"965 32",
			"966 32",
			"967 32",
			"968 32",
			"969 32",
			"970 32",
			"971 32",
			"972 32",
			"973 32",
			"974 32",
			"975 32",
			"976 32",
			"977 32",
			"978 32",
			"979 32",
			"980 32",
			"981 32",
			"982 32",
			"983 32",
			"984 32",
			"985 32",
			"986 32",
			"987 32",
			"988 32",
			"989 32",
			"990 32",
			"991 32",
			"992 32",
			"993 32",
			"994 32",
			"995 32",
			"996 32",
			"997 32",
			"998 32",
			"999 32",
			"1000 32",
			"1001 32"};	

	static int id = -1;

	public String readLine() {
		id++;
		if (test)
			return inData[id];
		else
			try{
				return in.readLine();	
			} catch( Exception e){
				e.printStackTrace();
			}
		return "";
	}
	
	public Integer nextInt(){
		return Integer.valueOf(readLine());
	}
	
	class Item{
		int price;
		int time;
		public Item(int time, int price) {
			super();
			this.price = price;
			this.time = time;
		}
		@Override
		public String toString() {
			return "Item [price=" + price + ", time=" + time + "]";
		}
	}

	public void solve() throws Exception {

		int nrOfItems = nextInt();
		
		List<Item> items = new ArrayList<Item>();
		
		for (int i = 0; i < nrOfItems; i++) {
			String line = readLine();
			
			items.add(new Item(Integer.valueOf(line.split(" ")[0]), Integer.valueOf(line.split(" ")[1])));
		}
		
		Collections.sort(items, new Comparator<Item>() { //sort to get good answears early

			@Override
			public int compare(Item o1, Item o2) {
				if(o1.price > o2.price)
					return 1;
				if(o1.price < o2.price)
					return -1;
				if(o1.time > o1.time)
					return -1;
				if(o1.time < o1.time)
					return 1;
				return 0;
			}
		});
		
		long totMoney = getBestTry(items, new ArrayList<Integer>(), Long.MAX_VALUE); 

		System.out.println(totMoney);
	}
	
	List<String> tested = new ArrayList<String>();
	
	private long getBestTry(List<Item> items, List<Integer> payIds, long bestVal){
		
		bestVal = getMoneyWithCurrentOrder(items, payIds, bestVal);

		long sumOfTimes = 0;
		long sumOfPrices = 0;
		
		for (Integer integer : payIds) {
			sumOfTimes += items.get(integer).time;
			sumOfPrices += items.get(integer).price;
		}
		
		if(sumOfTimes >= items.size() - payIds.size()
				|| sumOfPrices >= bestVal){ // no need to go deeper
			return bestVal;
		}
		
		for (int i = 0; i < items.size() ; i++) {
			Integer skipId = Integer.valueOf(i);
			
			if(items.get(skipId).time == 0)
				continue;
			
			if(!payIds.contains(skipId)){
				payIds.add(skipId);
				
				bestVal = getBestTry(items, payIds, bestVal);
				
				payIds.remove(skipId);
			}
		}
		
		return bestVal;
	}
	
	private long getMoneyWithCurrentOrder(List<Item> items, List<Integer> payIds, long bestVal) {
		//start paying for the id's then steal all the most expensive items left
		
		long totMoney = 0;
		long stealTime = 0;
		
		for (Integer integer : payIds) {
			totMoney += items.get(integer).price;
			stealTime += items.get(integer).time;
			
			if(totMoney > bestVal){
				return bestVal;
			}
		}
		
		for (int i = 0; i < items.size(); i++) {
			if(payIds.contains(Integer.valueOf(i))){
				continue;
			}
			if(stealTime > 0){
				stealTime--;
				continue;
			}
			Item item = items.get(i);
			stealTime = item.time;
			totMoney += item.price;
			if(totMoney >= bestVal){
				return bestVal;
			}
		}
		
		if(totMoney >= bestVal){
			return bestVal;
		}
		return totMoney;
	}

	public static void main(String[] args) throws Exception {
//		long currentTimeMillis = System.currentTimeMillis();
		new Two().solve();
//		System.out.println("Time: " + (System.currentTimeMillis() - currentTimeMillis));
		}
}