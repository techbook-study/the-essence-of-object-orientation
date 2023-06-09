# 이상한 나라의 객체
- 뚜렷한 경계를 가지고 함께 행동하는 물체를 하나의 개념 또는 유기적인 단위(객체)로 인지함

## 객체지향과 인지 능력
- 객체지향은 세상을 자율적이고 독립적인 객체들로 분해할 수 있는 인간의 기본적인 인지 능력에 기반을 두기 때문에 직관적이고 이해하기 쉬운 패러다임으로 말함
- 객체 = 인간이 분명하게 인지하고 구별할 수 있는 물리적인 또는 개념적인 경계를 지닌 어떤 것
- 객체지향 패러다임의 목적은 현실 세계를 모방하는 것이 아니라 현실 세계를 기반으로 새로운 세계를 창조하는 것

## 객체, 그리고 이상한 나라
### 이상한 나라의 앨리스
- 앨리스가 지형들을 통과하기 위해 키를 줄였다 늘렸다 하는 과정

### 앨리스 객체
- 상태
    - 자신의 키, 위치
    - 문을 통과하기 위한 적절한 상태로 자신의 키를 계속해서 변화 시킴
- 행동
    - 앨리스의 키를 변화시키는 것, 문을 통과하는 것
    - 음료를 마시는 것, 부채로 부채질 하는것, 쐐기벌레가 알려준 버섯을 먹는것, 상작속의 케이크를 먹는 것
- 상태를 결정하는 것은 행동이지만 행동의 결과를 결정하는 것은 상태임 = 앨리스가 한 행동의 결과는 앨리스의 상태에 의존적임
- 음료를 마셔(행동) 키(상태)를 변화시킴, 적절한 키를 만들어(선행조건) 문을 통과하여(행동) 위치(상태)를 이동함
- 행동에 의해 상태가 변경되어도 앨리스는 유일한 존재로 식별 가능함

## 객체, 그리고 소프트웨어 나라
- 객체 = 상태(state), 행동(behavior), 식별자(identity)를 지닌 실체로 보는 것이 가장 효과적임
- 객체 = 식별 가능한 개체 또는 사물(자동차처럼 구체적인 사물일 수도 있고, 시간처럼 추상적인 개념일 수도 있음)

### 상태
- 왜 상태가 필요한가?
    - 어떤 행동의 결과는 과거에 어떤 행동들이 일어났었느냐에 의존함
    - 과거의 행동의 이력을 통해 현재 발생한 행동의 결과를 판단하는 방식은 복잡하고 번거로우며 이해하기 어렵기 때문에 행동의 과정과 결과를 단순하게 기술하기 위해 상태라는 개념이 나옴
    - 앨리스의 키만 알면 문을 통과할 수 있는지 쉽게 판단할 수 있음
    - 상태를 이용하면 과거에 얽매이지 않고 현재를 기반으로 객체의 행동 방식을 이해할 수 있음
    - 세상의 복잡성을 완화하고 인지 과부화를 줄일 수 있음
- 상태와 프로퍼티
    - 숫자, 문자열, 양, 속도, 시간, 날짜, 참/거짓과 같은 단순한 값들은 객체가 아님
    - 단순한 값들은 다른 객체의 상태를 표현하기 위해 사용됨
    - 객체의 상태는 단순한 값과 객체의 조합으로 표현 가능
    - 프로퍼티(property) = 객체의 상태를 구성하는 모든 특징, 프로퍼티는 변경되지 않고 고정되기 때문에 '정적'임
    - 프로퍼티 값(property value) = 시간이 흐름에 따라 변경되기 때문에 '동적'임
    - 링크(link) = 객체와 객체 사이의 의미 있는 연결, 링크를 통해 메시지를 주고 받음, 한 객체가 다른 객체의 식별자를 알고 있음
    - 속성(attribute) = 객체를 구성하는 단순한 값(앨리스의 키와 위치)
- 객체는 자율적인 존재이며 다른 객체의 상태에 직접적으로 접근할 수도, 상태를 변경할 수도 없음
- 자율적인 객체는 자신의 상태를 책임짐
- 행동을 통해 간접적으로 객체의 상태를 변경하는 것이 가능함

### 행동
- 상태와 행동
    - 객체의 행동이 객체의 상태를 변경 시키키는 것은 행동이 부수 효과(side effect)를 초래함
    - 앨리스가 케이크를 먹는 행위는 앨리스의 키를 작게 변화(부수 효과)시키며 케이크의 양이 줄어듬(부수 효과)
    - 행동의 결과는 객체의 상태에 의존적임
    - 음료를 마신 후의 앨리스 키는 변화함 -> 음료를 마시는 행동의 결과가 앨리스 키에 의존함
    - 객체와 행동 사이의 관계
        - 객체의 행동은 상태에 영향을 받음
        - 객체의 행동은 상태를 변경시킴
    - 상호작용이 현재의 상태에 어떤 방식으로 의존하는가 = 앨리스의 키가 40센티미터 이하라면 문을 통과할 수 있음
    - 상호작용이 어떻게 현재의 상태를 변경시키는가 = 문을 통과한 후에 앨리스의 위치는 아름다운 정원으로 바뀌어야 함
    - 상태를 이용해 객체의 행동을 쉽고 우아하게 표현 가능
- 협력과 행동
    - 객체는 자신에게 주어진 책임을 완수하기 위해 다른 객체를 이용하고 다른 객체에게 서비스를 제공함
    - 객체끼리는 메시지를 통해 협력함
    - 객체의 행동으로 인해 자신의 상태 변경 또는 협력하는 다른 객체에 대한 메시지 전송의 부과 효과를 초래함
- 상태 캡슐화
    - 현실 세계에서 앨리스가 마신 음료의 상태를 결정하는 것은 앨리스이지만 객체지향에서는 음료 자신이 상태를 결정해야 함
    - 앨리스가 drinkBeverage()라는 메시지를 받아 음료를 마시면 음료 객체에게는 drunken(quantity)라는 메시지를 보냄
    - 메시지 송신자인 앨리스는 메시지 수신자인 음료의 상태 변경에 대해 전혀 알지 못함 = 캡슐화
    - 캡슐화 = 객체의 상태를 캡슐 안에 감춰둔 채 외부로 노출하지 않음
    - 상태를 외부에 노출시키지 않고 행동을 경계로 캡슐화하는 것은 객체의 자율성을 높임

### 식별자
- 객체가 식별 가능하다는 것은 객체를 서로 구별할 수 있는 특정한 프로퍼티가 존재한다는 것을 의미함
- 값(value)는 불변 상태(immutable state)를 가지며 값의 상태가 같으면 두 인스턴스를 동일한 것으로 판단 = 동등성(equality)
- 객체는 시간에 따라 변경되는 상태를 포함하며 행동을 통해 상태를 변경하는 가변 상태(mutable state)를 가지며 식별자를 기반으로 두 객체가 같은지를 판단 = 동일성(identical)
- 참조 객체(reference object), 엔티티(entity) = 식별자를 지닌 전통적인 의미의 객체
- 값 객체(value object) = 식별자를 가지지 않는 값

## 기계로서의 객체
- 쿼리(query) = 객체의 상태를 조회하는 작업
- 명령(command) = 객체의 상태를 변경하는 작업
- 기계은유의 가장 큰 장점은 객체 캡슐화를 직관적이고 시각적으로 묘사함
- 상태와 행동이 하나의 단위로 캡슐화 됨

## 행동이 상태를 결정한다
- 객체 설계시 상태를 먼저 고려하는 것은 좋은 설계가 아님
    - 상태를 먼저 결정할 경우 캡슐화가 저해됨
    - 객체를 협력자가 아닌 고립된 섬으로 만듬
    - 객체의 재사용성이 저하됨
- 다른 객체와 협력하기 위한 협력의 주체인 행동이 주가 되어야 함
- 행동을 결정하고 그 `행동이 적절한 상태를 선택`하게 됨

## 은유와 객체
### 두 번째 도시전설
- 객체지향 세계는 현실 세계의 단순한 모방이 아님
- 소프트웨어 상품이 실제 세계의 상품을 단순화하거나 추상화한 것이 아니라 특성이 전혀 다른 어떤 것을 의미함
- 모방과 추상화(실제 사물에서 자신이 원하는 특성만 취하고 필요없는 부분을 추려 핵심만 표현하는 행위)라는 개념만으로는 소프트웨어 객체 사이의 관계를 깔끔하게 설명하지 못함

### 의인화
- 현실세계의 수동적인 존재가 소프트웨어 객체로 구현될 때는 능동적으로 변함
- 소프트웨어 객체는 현실 객체의 부분적인 특징을 모방하는 것이 아니라 현실 객체가 가지지 못한 추가적인 능력을 보유함
- 객체지향 세계의 궁극적인 목적은 현실과 전혀 다른 새로운 세계를 창조하는 것이며 현실의 추상화가 아님

### 은유
- 은유 = 실제로는 적용되지 않는 한 가지 개념을 이용해 다른 개념을 서술하는 대화의 한 형태(그 여자 양 같아요 = 성격이 순함, 그 남자 사자 같아요 = 성격이 포악함)
- 실제 객체의 이름을 소프트웨어 객체의 이름으로 사용하여 표현적 차이(representational gap)을 줄여 소프트웨어의 구조를 쉽게 예측함 -> 유지보수성 증가

### 이상한 나라를 창조하라
- 객체지향 설계자로서 우리의 목적은 현실을 모방하는 것이 아니라 새로운 세계를 창조하는 것임