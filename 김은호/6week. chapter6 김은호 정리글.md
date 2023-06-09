### 요약 정리

#### 두가지 재료: 기능과 구조(P184)
- 객체 지향 세계를 구축하기 위해서는 사용자에게 제공할 기능과 기능을 담을 안정적인 구조라는 재료가 준비되어 있어야 합니다. 
- 구조는 사용자나 이해관계자들이 도메인(domain)에 관해 생각하는 개념과 개념들간의 관계를 표현합니다.
- 기능은 사용자의 목표를 만족시키기위해 책임을 수행하는 시스템의 행위로 표현합니다. 
- 일반적으로 기능을 수집하고 표현하기위한 기법을 유스케이스 모델이라 하고 구조를 수집하고 표현하기 위한 기법을 도메인 모델링이라 합니다. 

#### 안정적인 재료: 구조(P184)
- 도메인은 사용자가 프로그램을 사용하는 대상 분야를 말합니다. 
- 모델은 대상을 추상화하고 단순화한 것을 말합니다.
- 모델을 사용하면 현재의 문제와 관련된 측면은 추상화하고 그 밖의 관련없는 세부 사항에 대해서는 무시할 수 있습니다. 
- 도메인 모델이란 소프트웨어 개발과 관련된 이해 관계자들이 도메인에 대해 생각하는 관점입니다.
	- 은행 업무를 예시를 들면, 은행 업무에 종사하는 사람들은 은행 도메인을 고객과 계좌사이의 돈의 흐름으로 이해하는 것입니다. 
- 도메인 모델은 멘탈 모델이기도 합니다. 
- 멘탈 모델이란 사람들이 자기 자신, 다른 사람, 환경, 자신이 상호작용하는 사물들에 갖는 모형입니다.
- 노먼은 멘탈 모델을 사용자 모델, 디자인 모델, 시스템 이미지의 세가지로 분류합니다. 
	- 사용자 모델은 사용자가 제품에 대해 가지고 있는 개념입니다.
	- 디자인 모델은 설계자가 마음속에 갖고 있는 시스템에 대한 개념화입니다. 
	- 시스템 이미지는 최종 제품입니다. 
- 도메인 모델은 도메인에 대한 사용자 모델, 디자인 모델, 시스템 이미지를 포괄하도록 추상화한 소프트웨어 모델입니다. 
- 따라서 도메인 모델은 소프트웨어에 대한 멘탈 모델입니다.

#### 도메인 모습을 담을 수 있는 객체 지향(P187)
- 최종 코드는 사용자가 도메인을 바라보는 관점을 반영해야 합니다.
- 이것은 곧 애플리케이션이 도메인을 관점으로  설계해야된다는 것을 의미합니다. 
- 객체 지향을 이용하면 도메인에 대한 사용자 모델, 디자인 모델, 시스템 이미지가 모두 유사한 모습을 유지하도록 만드는 것이 가능해집니다.


#### 불안정한 기능을 담는 안정적인 도메인 모델(P189)
- 도메인 모델을 기반으로 코드를 작성하는 두번째 이유는 도메인 모델이 제공하는 구조가 상대적으로 안정적이기 때문입니다.
- 도메인 모델의 핵심은 사용자가 도메인을 바라보는 관점을 반영해 소프트웨어를 설계하고 구현하는 것입니다. 
- 도메인에 대한 사용자 관점을 반영해야하는 이유는 사용자들이 누구보다도 도메인의 본질적인 측면을 가장 잘 이해하고 있기 때문입니다. 
- 소프트웨어의 가장 큰 적은 변경이지만 사용자 모델에 포함된 개념과 규칙은 비교적 변경될 확률이 적기에 사용자 모델을 기반으로 설계와 코드를 만들면 변경에 쉽게 대처할 수 있을 가능성이 커집니다. 

#### 불안정한 재료: 기능(P192)
* 사용자의 목표를 달성하기 위해 사용자와 시스템 간에 이뤄지는 상호작용의 흐름을 텍스트로 정리한 것을 유스케이스라고 합니다. 
* 유스케이스는 다음과 같이 5가지 특성이 있습니다.
	1. 사용자와 시스템간의 상호작용을 보여주는 **텍스트**입니다.
	2. 하나의 시나리오가 아니라 여러 시나리오들의 집합입니다.
	3. 단순한 피처 목록과는 다릅니다.
		* 피처는 시스템을 수행하는 기능 목록을 단순히 나열한 것입니다.
	4. 사용자 인터페이스와 관련된 세부 정보를 포함해선 안됩니다.
	5. 내부 설계와 관련된 정보를 포함하지 않습니다.
		* 단지 기능적 요구사항을 사용자의 목표라는 문맥을 중심으로 묶기위한 정리기법입니다.

#### 재료 합치기: 기능과 구조의 통합(P197)
* 도메인 모델은 안정적인 구조를 개념화하기 위한 도구이고, 유스케이스는 불안정한 기능을 서술하기 위해 사용되는 도구입니다.
* 변경에 유연한 소프트웨어를 만들기 위해서는 유스케이스에 정리된 시스템 기능을 도메인 모델 기반으로 한 객체들의 책임으로 분배해야 합니다. 
* **책임-주도 설계**는 유스케이스로 부터 첫번째 메시지와 사용자가 달성하려는 목표를 추출하고 도메인 모델로 부터 구조를 제공받아 실제 동작하는 객체들의 협력 공동체를 창조합니다.
* 첫번째 메시지를 통해 목표 달성을 위한 기능 제공 책임을 맡은 시스템은 맡은 책임을 시스템 내 작은 규모로 세분화하고 이 과정을 반복하면서 객체간의 협력을 완성해갑니다. 
* 즉 책임-주도 설계 방법은 시스템의 기능을 역할과 책임을 수행하는 객체들의 협력관계로 바라보게 함으로서 두가지 기본재료인 유스케이스와 도메인 모델을 통합합니다.

### 느낀점 
* 제가 생각한 좋은 도메인 설계는 시스템과 관련된 모든 대상자들이 시스템을 이해할 수 있음과 자신의 생각들을 잘 녹일 수 있게 만드는 것이라 생각합니다.
* 그래서 시스템을 구축함에 있어 업무를 사용하는 담당자들이 이해할 수 있는 형태로 프로토타입을 만들거나 시스템의 flow를 ppt로 만들어 보기도 했습니다.
* 하지만 다음과 같은 문제가 있었습니다.
	1. **모두가 이해할 수 있는** 내용을 구성할 순 없었습니다.
	2. 차후 **시스템의 확장과 관리**를 할때 **설계 내용이 복잡**해서 이해하기 어려운 경우들이 많았습니다.
	3. **요구사항을 명확히 정리**하지 못하는 경우도 많았습니다.
* 그리고 이번장의 내용을 보며 **언제라도 사용자와 설계자가 이해하고 소통할 수 있는 설계**를 만들어야 좋은 설계를 할 수 있겠다는 생각을 한번 더 느끼게 되었습니다.  
* 그리고 생각의 적용을 이번 토이 프로젝트의 DDD(Domain Driven Design)를 통한 개념적 설계(Conceptual Design)로 적용해보았습니다.
	* 처음엔 도메인의 **이벤트단위**로 구분하여 행동을 정리하고 정리한 내용을 토대로 **액터(행동의 주체)** 를 지정해 어떤 대상이 어떤 행동을 할 수 있는지 정의했습니다.
	* 그리고 액터들의 행동 분류를 토대로 **애그리거트(트랜잭션 단위)** 를 분류해 **컨텍스트 바운드(각 애그리거트의 집합)** 를 만들었습니다. 
	* 서로 다른 컨텍스트 바운드의 행동에 영향을 줄 수 있는 부분은 **정책**으로 만들어 정리했고 마지막으로 도메인간의 흐름을 **컨텍스트 매핑**으로 정리했습니다.   
* 이번 설계 방식을 통해 얻을 수 있었던 이점은 다음과 같습니다
	* 컨텍스트 바운드를 통해 도메인의 책임을 명확히 할 수 있었습니다.
	* 각 컨텍스트 바운드를 정의해 서로의 역할과 정책을 통한 서로의 협력관계를 명확히 할 수 있었습니다. 
	* 토이 프로젝트에 참여한 대상자들(3명) 모두가 이해할 수 있었고 자신들이 생각한 중요한 부분을 **핫스팟**으로 정리해 공유할 수 있었습니다.
	* 액터의 행동을 토대로 명확히 API 설계를 할 수 있었습니다.
	* (확인이 필요하지만) 추후 비슷한 기능 구현시 충분히 활용 가능할 것 같습니다.
* 설계 내용을 보고 싶으시면 [V1 DDD 설계](https://feather-authority-910.notion.site/V1-DDD-70548b9848ed484aac4cd49c0076afcd)를 참고하시면 됩니다.^^

### 의문, 고민, 같이 이야기하고 싶은 부분
- 설계를 하신 경험이 있다면 어떤 부분을 중요하게 생각하셨는지와 어떻게 설계를 하셨는지 알려주세요^^