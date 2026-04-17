import { useState }  from "react";
function App(){
  const[waveHeight,setWaveHeight]=useState("");
  const[frequency,setFrequency]=useState("");
  const[springConstant,setSpringConstant]=useState("");
  const[result,setResult]=useState(null);
  const handleSubmit=async()=>{
    const response=await fetch("http://localhost:8080/api/simulate",{
      method :"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify({
        waveHeight:parseFloat(waveHeight),
        frequency:parseFloat(frequency),
        springConstant:parseFloat(springConstant)})
      });

    const data=await response.json();
    setResult(data);
  };
  return (
    <div style={{ padding: "20px" }}>
      <h2>Point Absorber Simulation</h2>

      <input placeholder="Wave Height"
        onChange={(e) => setWaveHeight(e.target.value)} /><br/>

      <input placeholder="Frequency"
        onChange={(e) => setFrequency(e.target.value)} /><br/>

      <input placeholder="Spring Constant"
        onChange={(e) => setSpringConstant(e.target.value)} /><br/>

      <button onClick={handleSubmit}>Simulate</button>

      {result && (
        <div>
          <p>Force: {result.force}</p>
          <p>Power: {result.power}</p>
        </div>
      )}
    </div>
  );
}
export default App;