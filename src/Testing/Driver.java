package testing;

import cubesolver.Solver;
import rubikscube.representation.RubiksCube;
import scramblers.CrossSolvedScrambler;
import scramblers.RandomStateScrambler;
import visualcube.attributes.StageMaskType;
import visualcube.attributes.VCAttributes;
import visualcube.generation.VisualCube;

class Driver {

    public static void main(String[] args) {
        RubiksCube cube = new RubiksCube();
        cube.executeScramble("U2");



        String result = Solver.solve(cube);
        System.out.println(result);



        RandomStateScrambler scrambler = new RandomStateScrambler();
        System.out.println(scrambler.generate());

        CrossSolvedScrambler cScrambler = new CrossSolvedScrambler();
        System.out.println(cScrambler.generate());



        VCAttributes attr = new VCAttributes()
                .algorithmCase("R U R' U'")
                .stageMask(StageMaskType.F2L);

        VisualCube.saveImageWithAttributesToFile(attr, "output/test_image");
    }
}
