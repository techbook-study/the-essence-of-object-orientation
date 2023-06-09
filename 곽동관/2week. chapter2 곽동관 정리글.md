## 요약 정리

### 이상한 나라의 앨리스(객체) 특징
- 앨리스(객체)는 상태를 가지며 상태는 변경 가능하다
- 앨리스(객체)의 상태를 변경 시키는 것은 앨리스(객체)의 행동이다.
	- 행동의 결과는 상태에 의존적이며 상태를 이용해 서술할 수 있다.
	- 행동의 순서가 결과에 영향을 미친다.
- 앨리스(객체)는 어떤 상태에 있더라도 유일하게 식별 가능하다.


하나의 개별적인 실체로 식별 가능한 물리적인 또는 개념적인 사물은 어떤 것이라도 객체가 될 수 있다.
객체의 다양한 특성을 효과적으로 설명하기 위해서는 객체를 상태(state), 행동(behavior), 식별자(identity)를 지닌 실체로 보는 것이 가장 효과적이다.

### 상태(state)
- 일상생활 속의 예)
	- 예시1) 자판기에 충분한 금액이 투입하기 전에는 원하는 음료를 선택할 수 없다.
	- 예시2) 엘리베이터가 움직이기 위해서는 먼저 원하는 층의 버튼을 눌러야 한다.
	- 예시3) 텔레비전의 전원을 켜지 않는 한 채널을 변경할 수 없다.
	- 모든 예의 공통점은 어떤 행동의 결과는 과거에 어떤 행동들이 일어났었느냐에 의존한다.
- 객체의 상태를 구성하는 모든 특징을 통틀어 객체의 프로퍼티(property)라고 한다.
	- 앨리스를 빗대어 표현하면 프로퍼티는 키, 위치, 음료 가 앨리스의 프로퍼티이고, 일반적으로 프로퍼티는 변경되지 않고 고정되기때문에 '정적'이다.
	- 프로퍼티의 값은 시간이 흐름에 따라 변경되기 때문에 '동적'이다. 
- 객체와 객체 사이의 의미 있는 연결을 링크(link)라고 한다.
	- 객체와 객체 사이에는 링크가 존재해야만 요청을 보내고 받을 수 있다.
- 객체를 구성하는 단순한 값은 속성(attribute)이라고 한다.
	- 앨리스의 키와 위치는 단순한 값으료 표현되기 때문에 속성이다.
- 객체란 자율적인 존재이다.
	- 다른객체의 상태에 직접적으로 접근 할 수 없다.
	- 상태를 변경할 수 없다.
	- 자율적인 객체는 스스로 자신의 상태를 책임져야 한다.
	- '행동'은 다른객체로 하여금 간접적으로 객체의 상태를 변경하는 것을 가능하게 한다.
	- 객체는 스스로의 행동에 의해서만 상태가 변경되는 것을 보장함으로써 객체의 자율성을 유지한다.

### 행동(behavior)
- 객체의 해동은 상태에 영향을 받는다.
- 객체의 행동은 상태를 변경 시킨다.
- 객체의 협력과 행동
	- 객체 자신의 상태 변경
	- 행동 내에서 협력하는 다른 객체에 대한 메시지 전송
- 현실 세계의 객체와 객체지향 세계의 객체 사이의 중요한 차이점 - 캡슐화
	- 외부로 노출 하는 것은 행동 뿐이며 상태 변경에대해선 전혀 알지 못한다.

### 식별자(identity)
- 객체를 서로 구별 할 수 있는 특정한 프로퍼티가 객체안에 존재한다는 것을 의미
- 값(value)은 숫자, 문자열, 날짜, 시간, 금액 등과 같이 변하지 않는 양을 모델링 한다.
	- 흔히 값의 상태는 변하지 않기 때문에 불변상태를 가진다고 말한다.
- 객체는 시간에 따라 변경되는 상태를 포함, 행동을 통해 상태를 변경한다.
	- 따라서 객체는 가변상태(mutable state)를 가진다고 말한다.
- 식별자를 기반으로 객체가 같은지를 판단할 수 있는 성질을 동일성(identical)이라고 한다.
- 참조객체(reference object), 엔티티(entity)는 식별자를 지닌 전통적인 의미의 객체를 가리키는 용어
- 값 객체(value object)는 식별자를 가지지 않는 값을 가리키는 용어

### 행동이 상태를 결정한다.
- 상태를 중심으로 객체를 바라보는 것이 아닌 행동을 중심으로 객체를 바라봐야한다.
1. 상태를 먼저 결정할 경우 캡슐화가 저해된다. - 상태가 객체 내부로 깔금하게 캡슐화되지 못하고 공용 인터페이스에 그대로 노출되버릴 확률이 높아진다.
2. 객체를 협력자가 아닌 고립된 섬으로 만든다. - 상태를 먼저 고려하는 방식은 협력이라는 문맥에서 멀리 벗어난채 객체를 설계하게 함으로써 자연스럽게 협력에 적합하지 못한 객체를 창조함
3. 객체의 재사용성이 저하된다. - 상태에 초점을 맞춘 객체는 다양한 협력에 참여하기 어렵기 때문
- 책임-주도 설계(Responsibility-Driven Design, RDD)

### 소프트웨어 객체의 특징 - 의인화(anthropomorphism)
- 소프트웨어의 객체는 현실속의 객체에 대한 은유이다.

## 읽고 느낀점

이번장을 읽고 느낀점은 현실세계의 객체와 소프트웨어의 객체를 동일 시 생각하던 나에게 조그마한 충격을 가져다주는 장이였습니다.
책에도 나와있던 것처럼 현실세계에서 객체(사물 등)를 자세히 관찰하고 그속에서 속성만 추려내는 방식을 생각하던 나에게 소프트웨어의 객체는 행동을 중심으로 자율성을 가진 객체를 만들어내는 방식을 권유하고 있습니다.
만약 예시가 이해가 안간다면 모를까 행동을 중심으로 객체를 만든다는 것에 대한 예시를 정확하게 설명해주니 좀더 소프트웨어적인 객체란 무엇일까를 생각하게 되는 장이네요.
