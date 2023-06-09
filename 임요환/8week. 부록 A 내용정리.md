# 추상화 기법
- 추상화 = 도메인의 복잡성을 단순화하고 직관적인 멘탈 모델을 만드는 데 사용할 수 있는 가장 기본적인 인지 수단 -> 도메인에 있는 개념들을 구조화하고 단순화함
- 분류와 인스턴스화
    - 분류 = 객체의 구체적인 세부 사항을 숨기고 인스턴스 간에 공유하는 공통적인 특성을 기반으로 범주를 형성하는 과정
    - 인스턴스화 = 분류의 역, 범주로부터 객체를 생성하는 과정
- 일반화와 특수화
    - 일반화 = 범주 사이의 차이를 숨기고 범주 간에 공유하는 특성을 강조함
    - 특수화 = 일반화의 역
- 집합과 분해
    - 집합 = 부분과 관련된 세부 사항을 숨기고 부분을 사용해서 전체를 형성하는 과정
    - 분해 = 집합의 반대 과정, 전체를 부분으로 분리함

## 분류와 인스턴스화
### 개념과 범주
- 객체를 분류하고 범주로 묶는 것 = 객체들의 특정 집합에 공통의 개념을 적용하는 것, 복잡성을 낮춤
- 개념 = 속성과 행위가 유사한 객체에 공통적으로 적용되는 관념이나 아이디어
    - 예) 자동차 범주에 적용되는 개념 = 바퀴를 이용해 사람들을 한 장소에서 다른 장소로 운반하는 운송수단, 나무라는 범주에 적용되는 개념 = 푸른 잎과 갈색의 줄기를 가진 다년생 식물
- 분류 = 객체에 개념(타입)을 적용하는 과정, 특정 개념을 나타내는 집합의 구성 요소로 포함시킴
- 인스턴스화 = 분류의 역, 범주로부터 객체를 생성하는 과정

### 타입
- 심볼 = 타입을 가리키는 간략한 이름이나 명칭
- 내연 = 타입의 완전한 정의, 내연의 의미를 이용해 객체가 타입에 속하는지 여부를 확인할 수 있음
- 외연 = 타입에 속하는 모든 객체들의 집합

### 외연과 집합
- 객체들은 동시에 서로 다른 집합에 포함될 수 있음
- 단일 분류(single classification) = 한 객체가 한시점에 하나의 타입에만 속할 경우
- 다중 분류(multiple classification) = 한 객체가 한시점에 여러 타입에 속할 경우
- 대부분의 객체지향 언어는 단일 분류만을 지원함 -> 오직 한 클래스의 인스턴스여야만 하며 동시에 두 개의 클래스의 인스턴스일 수 없음
- 다중 분류를 다중 상속과 혼동해서는 안됨
    - 다중 상속은 하나의 타입이 다수의 슈퍼타입을 가질수 있도록 허용하지만 타입 정의를 생략할 수 없는 반면 다중 분류는 특정한 타입을 정의하지 않고도 하나의 객체가 서로 다른 타입의 인스턴스가 되도록 허용함
- 동적 분류(dynamic classification) = 객체가 한 집합에서 다른 집합의 원소로 자신이 속하는 타입을 변경할 수 있는 경우
- 정적 분류(static classification) = 객체가 자신의 타입을 변경할 수 없는 경우
- 다중 분류와 동적 분류는 서로 배타적인 개념이 아니라 두개를 함께 적용하는 것이 실세계의 복잡성을 모델링하는데 유용함
- 다중 분류와 동적 분류의 관점에서 도메인 모델의 초암을 만들고 실제 구현에 적합하도록 단일 분류와 정적 분류 방식으로 객체들의 범주를 재조정하는 편이 분석과 구현간의 차이를 메울 수 있는 가장 현실적인 방법임

### 클래스
- 클래스 = 타입을 구현하는 가장 보편적인 방법, 코드를 재사용하는 용도
- 객체가 공유하는 본질적인 속성을 정의함
- 동일한 범주에 속하는 객체는 동일한 속성을 가져야함

## 일반화와 특수화
### 범주의 계층
- 계층 구조는 좀 더 세부적인 범주가 계층의 하위에 위치하고 좀 더 일반적인 범주가 계층의 상위에 위치함
- 계층의 상위에 위치한 범주를 계층의 하위에 위치한 범주의 일반화라고 함
- 계층의 하위에 위치한 범주는 계층의 상위에 위치한 범주의 특수화라고 함

### 서브타입
- 슈퍼타입(supertype) = 어떤 타입이 다른 타입보다 일반적임, 서브타입의 일반화
- 서브타입(subtype) = 어떤 타입이 다른 타입보다 좀 더 특수함, 슈퍼타입의 특수화
    - 슈퍼타입의 본질적인 속성을 모두 포함하기 때문에 계층에 속하는 모든 서브타입들은 슈퍼타입의 속성을 공유함
    - 어떤 타입이 다른 타입의 서브타입이 되기 위해서 '100% 규칙'과 'Is-a 규칙'을 준수해야 함
    - 100% 규칙
        - 타입의 내연과 관련된 규칙
        - 슈퍼타입의 정의가 100% 서브타입에 적용돼야 함
        - 서브타입은 속성과 연관관계 면에서 슈퍼타입과 100% 일치해야 함
    - Is-a 규칙
        - 타입의 외연과 관련된 규칙
        - 서브타입의 모든 인스턴스는 슈퍼타입 집합에 포함돼야 함
        - 서브타입은 슈퍼타입임

### 상속
- 클래스 간의 상속 = 일반화와 특수화 관계를 구현하는 가장 일반적인 방법
- 일반화의 원칙
    - 한 타입이 다른 타입의 서브타입이 되기 위해서는 슈퍼타입에 순응해야 함
    - 특정 기대 집합에 대해 서브타입의 슈퍼타입에 대한 대체 가능성을 의미함
    - 구조적인 순응(structural conformance)
        - 기대 집합은 속성과 연관관계에 관한 것
        - 타입의 내연과 관련된 100% 규칙을 의미함
    - 행위적인 순응(behavioral conformance)
        - 기대 집합은 행위가 동일한 계약을 기반으로 하느냐에 관한 것
        - 타입의 행위에 관한 것
        - 리스코프 치환 원칙(Liskov Substitution Principle, LSP)
- 코드 중복을 방지하고 공통 코드를 재사용하기 위한 방법
- 서브타이핑(subtyping)과 서브클래싱(subclassing)의 두가지 용도로 사용됨
- 서브타이핑
    - 서브클래스가 슈퍼클래스를 대체할 수 있는 경우
    - 설계의 유연성이 목표
    - 인터페이스의 상속(interface inheritance)
- 서브클래싱
    - 서브클래스가 슈퍼클래스를 대체할 수 없는 경우
    - 코드의 중복 제거와 재사용이 목적
    - 구현 상속(implementation inheritance)
- 위임(delegation) = 여러 클래스로 구성된 상속 계층에서 수신된 메세지를 이해하는 기본적인 방법


## 집합과 분해
### 계층적인 복잡성
- 복잡성은 계층의 형태를 띰
- 단순한 형태로부터 복잡한 형태로 진화하는 데 걸리는 시간은 그 사이에 존재하는 안정벅인 형태의 수와 분포에 의존함
- 집합
    - 안정적인 형태의 부분으로부터 전체를 구축하는 행위
    - 복잡성을 줄임
    - 불필요한 세부 사항을 추상화함
    - 불필요한 세부 사항을 감추기 때문에 추상화 메커니즘인 동시에 캡슐화 메커니즘임
- 분해 = 전체를 부분으로 분할하는 행위

### 합성 관계
- 객체와 객체 사이의 전체-부분 관계를 구현
- 부분을 전체 안에 캡슐화함으로써 인지 과부화를 방지함
- 주문 - 주문항목 <-> 상품
    - 주문항목은 주문 안에서 합성 관계로 존재함
    - 주문과 상품은 연관 관계로 존재함
    - 합성 관계로 연결된 객체(주문항목)는 포함하는 객체(주문)가 제거될 때 내부에 포함된 객체(주문항목)도 함께 제거됨, 생명주기 측면에서 연관 관계보다 더 강하게 객체들을 결합함
    - 연관 관계로 연결된 두 객체는 생명주기와 관련된 어떤 제약도 부과하지 않음, 독립적으로 제거가능, 주문이 제거된다고해서 상품은 제거되지않고 계속 판매될 수 있음

### 패키지
- 합성 관계를 이용해 커다란 객체 그룹을 단순화하더라도 클래스가 많아지면 클래스 간의 의존성을 관리하는것이 어려워지므로 구조를 알려줄 안내 지도가 필요함
- 패키지(package), 모듈(module) = 소프트웨어의 전체적인 구조를 표현하기 위해 관련된 클래스 집합을 하나의 논리적인 단위로 묶는 구성 요소
- 시스템의 전체적인 구조를 이해하기 위해 한 번에 고려해야 하는 요소의 수를 줄일 수 있음
- 개별 클래스가 아닌 클래스의 집합을 캡슐화함으로써 전체적인 복잡도를 낮출 수 있음
- 내부의 포함된 클래스들을 감춤으로써 시스템의 구조를 추상화함
