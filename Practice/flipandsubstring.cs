using System;
using System.IO;
namespace flipeandsubstring{    
    public class program{        
        public static void Main(string[] args){
            string number=Console.ReadLine();
            int A=Convert.ToInt32(Console.ReadLine());
            int B=Convert.ToInt32(Console.ReadLine());
            int zeroCount=CountZeros(number);        
        }        
        public static int CountZeros(string input){
            int count=0;
            foreach(var i in input){
                if(i=='0')
                    count++;
            }
            return count;
        }
    }    
}

//
//10101
//01101
//00111
//11111