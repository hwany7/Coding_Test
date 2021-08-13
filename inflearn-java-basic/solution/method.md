
# java.lang
___

### Character.toUpperCase(char) : return char
* char 을 입력받아 대문자로 만들어 문자 반환

### Character.toLowerCase(char) : return char
* char 을 입력받아 소문자로 만들어 문자 반환

### Character.isLowerCase(char) : return boolean
* char 을 입력받아 소문자인지 체크하여 결과 반환

### Character.isAlphabetic(char) : return boolean
* char 을 입력받아 알파벳인지 체크하여 결과 반환

### Character.isDigit(char) : return boolean
* char 을 입력받아 숫자(0~9)인지 체크하여 결과 반환









### Integer.parseInt(String, 진수) : return int
* String 을 입력받아 해당 진수로 바꿔 int 형으로 반환 한다










### String.valueOf(char[]) : return String
* char[]을 입력받아 String 으로 반환









### str.toUpperCase()  : return String
* str 을 모두 대문자로 만들어 string 반환

### str.toLowerCase()  : return String
* str 을 모두 소문자로 만들어 string 반환

### str.charAt(index) : return char
* index 를 입력받아 해당 index 의 문자를 반환

### str.toCharArray() : return char[]
* 해당 str 을 문자형 배열로 만들어서 반환

### str.indexOf(char) : return int
* str 에서 해당 char 를 찾아 인덱스를 반환

### str.split(string) : return String[]
* " "과 같은 string 을 기준으로 str 을 잘라서 String 배열로 반환

### str.substring(start, end) : return String
* str 의 index start(<=)  end(>) 의 사이를 잘라서 String 으로 반환

### srt.substring(num) : return String
* num 의 수만큼 앞에서 잘라내고 String 으로 반환

### str.equalsIgnoreCase(String) : return boolean
* String 을 입력받아 str 과 같은지 대소문자는 무시하며 비교 

### str.replaceAll(regex, replacement) : return string
* 정규식을 입력받아 해당하는 문자를 대체문자로 변환해서 String 으로 반환







### new StringBuilder(String).reverse().toString() : String
* 객체 StringBuilder 를 생성해 String 을 입력받아 거꾸로 만들고, 그것을 String 화 시켜 반환










___
# java.util
___

### ArrayList.add(Element) : return boolean
* 해당 자료형의 값을 배열리스트에 더하고 그 결과를 반환


### map.put(key, value)
* 맵에 (key, value)를 추가

### map.get(key) : return value
* key 에 대한 value 를 얻음

### map.getOrDefault(key, default) : return value and default
* key 에 대한 값을 찾고, 값이 없으면 default 를 반환

### map.keySet() : return Set<제너릭>
* key 의 셋을 Set 제너릭으로 반환

### map.containsKey(key) : return boolean
* 맵에 해당 key 가 있는지 반환

### map.size() : return int
* key 의 개수를 반환

### map.remove(key)
* 특정 key 를 삭제

### map.equals(map2) : return boolean
* map 과 map 을 key, value 가 같은지 비교해서 결과 리턴(NO SAME)

### new TreeSet<>(Collections.reverseOrder())
* 트리셋을 만들고, 기본으로 내림차순 정렬하여 만든다

### treeSet.add(value)
* value 를 추가한다 (중복제거)

### treeSet.remove(value)
* value 를 제거

### treeSet.size() : return int
* 사이즈를 반환

### treeSet.first() : return first value
* 가장 앞의 값을 반환

### treeSet.last() : return last value
* 가장 나중의 값을 반환

### Stack<제너릭> stack = new Stack<>()
* 스택을 제너릭 형으로 생성

### stack.push(value)
* 스택 맨 끝에 value 를 추가

### stack.pop() : return value
* 스택에서 맨 끝 value 를 삭제하고 반환

### stack.size() : return int
* 스택의 크기를 반환

### stack.get(index) : return int
* 스택의 index 번째 value 를 반환(삭제x)