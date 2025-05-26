package project25.advance;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Patterns
//Expression	Description
//[abc]	Find one character from the options between the brackets
//[^abc]	Find one character NOT between the brackets
//[0-9]	Find one character from the range 0 to 9

// regex java: 必须用 \\ 而不能用\
// "\\d{10}" means 10 digits : 匹配 10位数字，常用于手机号码或账号校验。
// .*\\d.*：字符串中只要包含一个数字（\d），就匹配成功。

// Metacharacters
// |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
// .	Find just one instance of any character
// ^	Finds a match as the beginning of a string as in: ^Hello
// $	Finds a match at the end of the string as in: World$
// \\d	Find a digit
// \\s	Find a whitespace character
// \\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
// \\uxxxx	Find the Unicode character specified by the hexadecimal number xxxx


// quantifiers
//n+	Matches any string that contains at least one n
//n*	Matches any string that contains zero or more occurrences of n
//n?	Matches any string that contains zero or one occurrences of n
//n{x}	Matches any string that contains a sequence of X n's
//n{x,y}	Matches any string that contains a sequence of X to Y n's
//n{x,}	Matches any string that contains a sequence of at least X n's


public class regExPractice {
    // regular expression
    // Regular expressions can be used to perform all types of
    // text search and text replace operations.


    public static void main(String[] args) {
        String input = "1234567890";
        String pattern = "\\d{10}";
        System.out.println(Pattern.matches(pattern, input));

        //示例: 从句子中提取所有单词

        String sentence = "Java is powerful!";
        Pattern pattern2 = Pattern.compile("\\b\\w+\\b");
        Matcher matcher = pattern2.matcher(sentence);

        //Pattern.compile(...)     // 编译成规则
        //          ↓
        //pattern.matcher(...)     // 把规则应用到目标字符串
        //          ↓
        //matcher.find()           // 循环一个一个找匹配项
        //          ↓
        //matcher.group()          // 拿到具体匹配到的内容

        if (matcher.find()) {
            System.out.println("Word: " + matcher.group());
        } else {
            System.out.println("No found");
        }
        // 只会找到一个

        while (matcher.find()) {
            System.out.println(matcher.group());  // 输出 is, powerful
        }
        // .find() 每次都在上一次结束的位置继续查找
        //.group() 只能获取“上一次成功 find 的结果”


        // 大小写不敏感 找多个关键字
        String s1 = "I like cats and dogs.";
        String regex1 = "cat|dog";
        Pattern pattern3 = Pattern.compile(regex1, Pattern.CASE_INSENSITIVE);
        Matcher matcher2 = pattern3.matcher(s1);

        while(matcher2.find()){
            System.out.println("Found: " + matcher2.group());
        }


        // 匹配邮箱地址

        String emailText = "Contact me at test123@example.com";
        String regex3 = "\\b[\\w.-]+@[\\w.-]+\\.\\w{2,4}\\b";

        Pattern pattern4 = Pattern.compile(regex3);
        Matcher matcher4 = pattern4.matcher(emailText);

        while(matcher4.find()){
            System.out.println(matcher4.group());
        }

    }
}
