"C", "H", "D", "S"
1 --> 13

{"2C", "3C", "4H"}
{"2C", "3C", "5C"}
{"5C", "5D", "5H"}

Class Card{
int value;
String suit;
// Assume geters and setters
}

ASSUMPTIOn -- Parse the list and update the Card(s) and populate the Input in desired format.
```
//========================================================
{"2C", "3C", "4C"}
{"2C", "3C", "4H"}

// =================================
{"2C", "4C", "3C"}

// Preprocessing (TreeMap<Integer, String>)

TreeMap<Integer, String> ..Keys will be sorted..Iterate over the keys .. SET

i2--3C
i1--2C
```
//=====//=====//=====//=====//=====//=====//=====//=====//=====
//=====//=====//=====//=====//=====//=====//=====//=====//=====

//========
```
boolean isValid(List<Card> set) {

List<Integer> values = new ArrayList<>();
if(set.size() < 3 ) {
return false;
}

// Initial State

boolean sameVal = true;
boolean isPureSeq = true;

for(int i2=1; i2 < set.size(); i2++) {
int v1 = set.get(i2-1).getVal();
int v2 = set.get(i2).getVal();

    String s1 = set.get(i2-1).getSuit();
    String s2 = set.get(i2).getSuit();
    
    if(v1 != v2){
        // Conditin 1 can not be met
        sameVal = false;
        if(v2 == v1+1 && s1 == s2) {
          continue;
        }
        else {
          isPureSeq = false;
          break;
        }
    }
    // Here sameVal remains true

}

// Meet either of both criterias
return(sameVal || isPureSeq);

}
```
//===========
{"1C", "2C", "3C", "3S", "3H"}

1C, 2C, 3C
3C, 3S, 3H

Returnt he possible valid Sets using the input LIST ?
Its Sorted by Rank
```
1,2,3,3,3,3... (Two pointers to determine if we have 3 same values )

Slding window based apparoach

SECONC CONSTRAINT
```
