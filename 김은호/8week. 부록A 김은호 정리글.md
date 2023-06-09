### 요약 정리
#### 추상화 기법(P229)
* 사람들은 도메인에 존재하는 개념들을 구조화하고 단순화하기 위해 다양한 추상화 기법을 사용합니다.
* 추상화 기법의 종류는 다음과 같습니다.
	* **분류와 인스턴스화 분류**
		* 객체의 세부사항을 숨기고 인스턴스간에 공유하는 공통적인 특성을 기반으로 범주를 형성합니다. 
		* 분류의 역은 범주로 부터 객체를 생성하는 인스턴스화 과정입니다.
	* **일반화와 특수화**
		* 일반화는 범주 사이의 차이를 숨기고 범주 간에 공유하는 공통적인 특성을 강조합니다. 
		* 일반화의 역을 특수화라고 합니다.
	* **집합과 분해**
		* 집합은 부분과 관련된 세부 사항을 숨기고 부분을 사용해 전체를 형성하는 과정을 말합니다. 
		* 집합의 반대 과정은 전체를 부분으로 분리하는 분해 과정입니다. 

#### 분류와 인스턴스화
##### 개념과 범주(P230)
<img style="width:100%" src="https://github.com/OiKimiO/the-essence-of-object-orientation/assets/53805469/c0d29999-360c-4a4a-a563-40ca210022c6" />
* **개념**
	* 속성과 행위가 유사한 객체에 공통적으로 적용되는 관념이나 아이디어입니다. 
* **객체**
	* 사람들이 분류한 개별적인 현상들을 말합니다. 
* **범주**
	* 같은 개념을 가진 객체들의 집합을 말합니다.
* **분류**
	* 세상에 존재하는 객체에 개념을 적용하는 과정을 말합니다.

##### 타입(P232)
* 타입을 정의하는 3가지 관점은 다음과 같습니다.
  * 심볼
    * 타입을 가리키는 간략한 이름이나 명칭
  * 내연
    * 타입의 완전한 정의, 내연의 의미를 이용해 객체가 타입에 속하는지 여부를 확인할 수 있습니다. 
  * 외연
    * 타입에 속하는 모든 객체들의 집합을 말합니다.

##### 외연과 집합(P233)
* 타입의 외연은 타입에 속하는 객체들의 집합으로 표현합니다. 
* 단일 분류와 다중 분류의 개념은 다음과 같습니다. 
  * 단일 분류
    * 한 객체가 한 시점에 하나의 타입에만 속한 것을 말합니다.  
  * 다중 분류
    * 한 객체가 한 시점에 여러 타입에 속할 경우를 말합니다.
* 대부분의 객체지행 프로그래밍 언어들은 단일 분류만을 지원합니다. 이는 한 객체가 오직 한 클래스의 인스턴스여야만 하고 동시에 
  두개의 클래스 인스턴스일 수는 없다는 것을 의미합니다. 
* 또한 객체가 타입을 변경할 때의 관점으로 동적 분류와 정적 분류가 있습니다. 
  * 동적 분류
    * 객체가 한 집합에서 다른 집합의 원소로 자신이 속하는 타입을 변경하는 경우를 말합니다. 
  * 정적 분류
    * 객체가 자신의 타입을 변경할 수 없는 경우를 말합니다. 
* 여기서 다중 분류와 동적 분류는 도메인을 분석하기엔 유용하지만 객체 지향 프로그래밍 언어의 제약으로 인해 구현이 어렵다는 단점이 있습니다. 
* 그래서 다중 분류와 동적 분류를 통해 도메인 모델의 초안을 만들고, 실제 구현 단계에서 단일 분류와 정적 분류 방식으로 객체들의 범주를 
  조정하는 것이 가장 현실적인 방법입니다.

##### 클래스(P236)
* 객체지향 프로그래밍 언어를 이용해 타입을 구현하는 가장 보편적인 방법은 클래스를 이용하는 것입니다.
* 클래스는 타입을 구현하는 용도 외에도 코드를 재사용하는 용도로 사용됩니다. 
* 클래스는 객체가 공유하는 본질적인 속성을 정의합니다
* 대부분의 객체 지향 언어는 본질적인 속성은 표현할 수 있지만 우연적인 속성은 표현할 수 없습니다. 
* 따라서 동일한 범주에 속하는 객체는 모두 동일한 속성을 가져야 합니다. 

#### 일반화와 특수화(P237)
##### 서브 타입(P239)
* 객체 지향 세계에서 범주는 개념을 의미하고, 개념은 타입을 의미함으로 일반화와 특수화는 계층 구조안에 존재하는 타입간의 관계를 의미합니다.
  * 슈퍼 타입
      * 어떤 타입이 다른 타입보다 일반적인 경우를 말합니다.
  * 서브 타입
      * 어떤 타입이 다른 타입보다 좀 더 특수한 경우를 말합니다. 
* 서브 타입은 슈퍼 타입의 본질적인 속성을 모두 포함하기에 계층에 속하는 모든 서브 타입들은 슈퍼 타입의 속성을 공유한다는 것을 쉽게 예측할 수 있습니다. 
* 이같은 일반화를 사용하면 파편화된 사실은 모르더라도 복잡한 세상의 속성을 논리적으로 쉽게 이해할 수 있게 됩니다.  
* 크레이그 라만은 어떤 타입이 서브 타입이 되기 위해서는 100% 규칙과 is-a 규칙을 준수해야한다고 말합니다. 
  * 100% 규칙 
    * 슈퍼 타입의 정의가 100% 서버 타입에 적용돼야 한다는 뜻입니다. 
    * 서브타입은 속성과 연관관계 면에서 슈퍼타입과 100% 일치해야 합니다.
  * is-a 규칙
    * 서브 타입의 모든 인스턴스는 슈퍼타입의 집합에 포함돼어야 한다는 뜻입니다.    
    * 이는 대개 영어로 "서브타입은 슈퍼타입이다."라는 구문을 통해 테스트할 수 있습니다. 

##### 상속(P242)
* 프로그램 언어를 이용해 일반화와 특수화를 표현하는 가장 일반적인 방법은 상속입니다. 
* 프로그램 내의 두 클래스 간에 상속관계가 존재할 때 이 관계를 반드시 일반화 관계라고는 할 수 없습니다.
* 일반화의 원칙은 한 타입이 다른 타입의 서브타입이 되기 위해 슈퍼 타입에 순응해야 합니다. 
* 이때, 순응에는 2가지 종류가 있는데 하나는 구조적인 순응, 행위적인 순응으로 구분됩니다. 
   * 구조적인 순응
     * 타입의 내연과 관련된 100% 규칙을 의미합니다.
   * 행위적인 순응
     * 타입의 행위에 관한 것이며, 서브타입은 슈퍼타입을 행위적으로 대체 가능해야 한다는 것을 말합니다. 
     * 행위적인 순응을 흔히 리스코프 치환 원칙이라고 합니다. 
* 상속은 서브타이핑과 서브클래싱으로 구분될 수 있습니다.
   * 서브타이핑
     * 서브클래스가 슈퍼클래스를 대체할 수 있는 경우를 서브타이핑이라고 합니다. 
     * 흔히 서브타이핑을 인터페이스 상속이라고 합니다.   
   * 서브클래싱
     * 서브클래스가 슈퍼클래스를 대체할 수 없는 경우에는 서브클래싱이라고 합니다.
     * 서브클랫을 구현 상속이라고 표현합니다. 
* 상속은 서브타이핑을 프로그래밍 언어적으로 구현하는 데 사용될 순 있지만 모든 상속이 서브타이핑인것은 아닙니다. 
* 서브클래스가 슈퍼클래스를 대체하지 않고 단지 코드만 공유하는 서브클래싱도 존재합니다. 

##### 집합과 분해(P244)
#### 패키지
* 소프트웨어에서는 물리적인 형체가 존재하지 안하 구조를 단순화하기 위해선 서로 관련성이 높은 클래스 집합을 
  논리적인 단위로 통합해야합니다. 
* 소프트웨어의 전체적인 구조를 표현하기 위해 관련된 클래스 집합을 하나의 논리적인 단위로 묶는 구성요소를 패키지
  혹은 모듈이라고 합니다. 
* 패키지는 내부에 포함된 클랫들을 감춤으로써 시스템의 구조를 추상화 합니다. 

### 느낀점
* 이전 부터 인터페이스를 잘 만들어야 한다. 추상화를 잘 해야한다는 말을 참 많이 들어왔습니다. 
* 그리곤 개발자 친구들과 추상화와 관련된 이야기가 나오면 추상화라는 것이 무엇인지 또 그것이 중요한다는 것은 알지만 
  왜 중요한지에 대해서 정확히 말을 나눌 순 없었습니다.
* 그렇지만 객체지향의 사실과 오해를 보며 추상화 과정이 개발자의 관점에서는 복잡성을 낮추고 유지 보수의 편의성을 
   보장시킨다는 것과, 한편으로는 시스템을 이용하는 대상도 이해할 수 있는 흐름을 보여준다는 점에서 너무 중요하다는 것을
   깨닫게 된 것 같습니다. 

### 의문, 고민, 같이 이야기하고 싶은 부분
* 개발자들에게 있어 추상화는 무엇이라고 생각하나요?