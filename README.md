<h1>TimerCoroutineBasicAndroid</h1>
<h2>Usando coroutinas no Android para evitar bloqueio de tela, ao clicar nos botões de start timers</h2>
<p>Os botões incrementam e atualizam a tela a cada 1 e 5 segundos, incrementando toda vez que são clicados.</p>
<p>No entando, sem coroutines, a experiência de usuário é péssima, pois por exemplo, clicando no botão start 5 segundos, a tela fica travada
durante 5 segundos, não sendo possível ter nenhuma interação com a activity, até que a task termine de utilizar a Thread principal.</p>
<p>Com as coroutines, conseguimos resolver esse problema com menos código do que usar Thread{ //algum código }.start( ), evitando muito código boilerplate</p>
