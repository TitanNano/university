(function(){
    
    'use strict';
    
    var ReadLine= require('readline');
    
    var dic= {
        tens : {
            '10' : 'teen',
            '20' : 'twenty',
            '30' : 'thirty',
            '40' : 'forty',
            '50' : 'fifty',
            '60' : 'sixty',
            '70' : 'seventy',
            '80' : 'eighty',
            '90' : 'ninety'
        },
        'ones' : {
            '1' : 'one',
            '2' : 'two',
            '3' : 'three',
            '4' : 'four',
            '5' : 'five',
            '6' : 'six',
            '7' : 'seven',
            '8' : 'eight',
            '9' : 'nine'
        },
        'specials' : {
            '11' : 'eleven',
            '12' : 'twelve',
            '13' : 'thir-teen',
            '14' : 'four-teen',
            '15' : 'fif-teen',
            '16' : 'six-teen',
            '17' : 'seven-teen',
            '18' : 'eight-teen',
            '19' : 'nine-teen'
        }
    };
    
    var numbToString= function(number){
        if(String(number) in dic.specials){
            return dic.specials[String(number)];
        }
        if(number >= 10){
            var tens= ((number / 10) | 0) * 10;
            var ones= number - tens;
        
            return dic.tens[String(tens)] + (ones > 0 ? ('-' + dic.ones[String(ones)]) : '');
        }else{
            return dic.ones[String(number)];
        }
    };
    
    var rl= ReadLine.createInterface({
        input : this.process.stdin,
        output : this.process.stdout
    });
    
    rl.question('amount of bottles: ', function(answer){
        var number= parseInt(answer);
        
        console.log('\n\n');
        
        while(number > 0){
            if(number > 1){
                console.log(numbToString(number)+' bottles of beer on the wall,\n'+ numbToString(number) +' bottles of beer.\nTake one down, pass it around,\n'+ numbToString(--number) +' bottles of beer on the wall.\n');
            }else if(number == 1){
                console.log('One last bottle of beer on the wall,\nOne last bottle of beer.');
                number--;
            }
        }
        console.log('Take it down, pass it around,\nNo more bottles of beer on the wall.');
        rl.close();
    });
}).apply(global);
