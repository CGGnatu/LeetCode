class Solution {
    public String addBinary(String a, String b) {
        int len1=a.length(),len2=b.length();
        String result=""; 
        int gap=len1-len2;
        int carry=0;          //control carry bit
        int temp;             //store the digits provisionally
        while(gap>0){         //two "while" loop make the two input strings same length
            b="0"+b;
            gap--;
        }
        while(gap<0){
            a="0"+a;
            gap++;
        }
        for(int i=a.length()-1;i>=0;i--){            //check every digit in the two strings
            if(a.charAt(i)=='1'&&b.charAt(i)=='1'){    //binary 1 plus 1 equals 0 and carry=1
                temp=(2+carry)%2;
                result=temp+result;
                carry=1;
            }
            else if(a.charAt(i)=='0'&&b.charAt(i)=='0'){   //binary 0 plus 0 equals 0 and carry=0
                temp=0+carry;
                result=temp+result;
                carry=0;
            }
            else if(a.charAt(i)!=b.charAt(i)){       //binary 1 plus 0 equals 1 and carry=0
                temp=(1+carry)%2;
                result=temp+result;
                if(temp==0) carry=1;
                else carry=0;
            }
        }
        if(carry==1) result=1+result;
        else if(result.length()>=2){               //for any result with a length more than 1, abandon all 0 ahead of the first 1
            int loca=result.indexOf("1");
            result=result.substring(loca);
        }
        return result;
    }
}
