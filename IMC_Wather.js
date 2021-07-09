//console.log('*** MEDIDOR DE IMC E CONSUMO DE AGUA MÍNIMO ***\n\n')

imc = function (altur, pezo) {
  total = pezo / (altur * altur);
  resultado = total.toFixed(2);
  agua = (35 * pezo) / 1000;


  if (resultado < 18.5) {
    return 'Seu IMC é: ' + resultado + ".\nVocê está abaixo do peso.\nE você deve consumir diariamente ao menos " + agua + "0 litros de água.\n\n";
  }
  if (resultado >= 18.5 && resultado <= 24.9) {
    return 'Seu IMC é: ' + resultado + ".\nVocê está com o peso ideal. PARABÉNS!\nE você deve consumir diariamente ao menos " + agua + "0 litros de água.\n\n";
  }
  if (resultado >= 25 && resultado <=29.9) {
    return 'Seu IMC é: ' + resultado + ".\nVocê está levemente acima do peso.\nE você deve consumir diariamente ao menos " + agua + "0 litros de água.\n\n";
  }
  if (resultado >=30 && resultado <= 34.9) {
    return 'Seu IMC é: ' + resultado + ".\nVocê está Obesidade Grau I. DEVE SE CUIDAR!\nE você deve consumir diariamente ao menos " + agua + "0 litros de água.\n\n";
  }
  if (resultado >=35 && resultado <= 39.9) {
    return 'Seu IMC é: ' + resultado + ".\nVocê está Obesidade Grau II (severa). DEVE SE CUIDAR!\nE você deve consumir diariamente ao menos " + agua + "0 litros de água.\n\n";
  }
  if (resultado >39) {
    return 'Seu IMC é: ' + resultado + ".\nVocê está Obesidade Grau III (mórbida). DEVE SE CUIDAR!\nE você deve consumir diariamente ao menos " + agua + "0 litros de água.\n\n";
  }
}

var altur=prompt("Insira sua altura: ");
var pezo=prompt("Insira seu peso: ");

document.write(imc(altur, pezo))
//console.log(imc(altur, pezo))
//console.log(imc(1.70,80))